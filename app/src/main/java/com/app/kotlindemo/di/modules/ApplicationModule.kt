package com.app.kotlindemo.di.modules


import android.app.Application
import android.content.Context

import com.app.kotlindemo.data.AppDataManager
import com.app.kotlindemo.data.DataManager
import com.app.kotlindemo.data.prefs.AppPreferencesHelper
import com.app.kotlindemo.data.prefs.PreferencesHelper
import com.app.kotlindemo.di.ApplicationContext
import dagger.Module
import dagger.Provides

import javax.inject.Singleton

/**
 * Created by svk on 5/6/17.
 */
@Module
class ApplicationModule(private val mApplication: Application) {

    @Provides
    @ApplicationContext
    fun provideContext(): Context {
        return mApplication
    }

    @Provides
    fun provideApplication(): Application {
        return mApplication
    }

    @Singleton
    @Provides
     fun providePrefHelper(mAppPreferencesHelper: AppPreferencesHelper): PreferencesHelper {
        return mAppPreferencesHelper
    }

    @Provides
    @Singleton
      fun provideDataManager(appDataManager: AppDataManager): DataManager {
        return appDataManager
    }
}
