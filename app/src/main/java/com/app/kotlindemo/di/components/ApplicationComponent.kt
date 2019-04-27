package com.app.kotlindemo.di.components


import android.app.Application
import android.content.Context


import com.app.kotlindemo.data.DataManager
import com.app.kotlindemo.di.ApplicationContext
import com.app.kotlindemo.di.modules.ApplicationModule
import com.app.kotlindemo.di.modules.NetworkModule
import com.app.kotlindemo.shared.Dirt2Clean
import dagger.Component

import javax.inject.Singleton

@Singleton
@Component(modules = [ApplicationModule::class, NetworkModule::class])
interface ApplicationComponent {

    val dataManager: DataManager

    fun inject(app: Dirt2Clean)

    @ApplicationContext
    fun context(): Context

    fun application(): Application
}