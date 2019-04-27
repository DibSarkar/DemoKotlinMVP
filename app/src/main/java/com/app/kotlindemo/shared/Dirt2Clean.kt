package com.app.kotlindemo.shared

import android.app.Application
import android.content.Context

import android.util.Log
import com.app.kotlindemo.di.components.DaggerApplicationComponent
import com.app.dirt2clean.utils.FakeCrashLibrary
import com.app.kotlindemo.BuildConfig
import com.app.kotlindemo.data.DataManager
import com.app.kotlindemo.di.components.ApplicationComponent
import com.app.kotlindemo.di.modules.ApplicationModule
import com.app.kotlindemo.di.modules.NetworkModule
import com.app.kotlindemo.utils.Constants

import javax.inject.Inject

import timber.log.Timber

class Dirt2Clean : Application() {

    internal var applicationComponent = DaggerApplicationComponent.builder()
        .applicationModule(ApplicationModule(this))
        .networkModule(NetworkModule(Constants.baseUrlLocal)).build()

    @Inject lateinit var mDataManager: DataManager


    override fun onCreate() {
        super.onCreate()

        applicationComponent.inject(this)

        if (BuildConfig.DEBUG) {
            Timber.uprootAll()
            Timber.plant(Timber.DebugTree())
        } else
            Timber.plant(CrashReportingTree())
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

    }

    fun getApplicationComponent(): ApplicationComponent {
        return applicationComponent
    }

    fun getDataManager(): DataManager? {
        return mDataManager
    }
    private class CrashReportingTree : Timber.Tree() {
        override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
            if (priority == Log.VERBOSE || priority == Log.DEBUG) {
                return
            }

            tag?.let { FakeCrashLibrary.log(it, message) }

            if (t != null) {
                FakeCrashLibrary.logError(t)
            }
        }
    }
}
