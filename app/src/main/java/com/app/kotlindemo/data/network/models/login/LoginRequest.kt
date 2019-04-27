package com.app.kotlindemo.data.network.models.login

import android.content.Context
import com.app.kotlindemo.data.network.ApiHelper
import com.app.kotlindemo.data.prefs.PreferencesHelper
import com.app.kotlindemo.di.ApplicationContext

class LoginRequest {

    private var mobile: String
    private var password: String
    private var device_token: String
    private var device_type: String

    constructor(mobile: String, password: String, device_token: String, device_type: String) {
        this.mobile = mobile
        this.password = password
        this.device_token = device_token
        this.device_type = device_type
    }

    fun setDevice_type(device_type: String) {
        this.device_type = device_type
    }

    fun getDevice_type(): String {
        return device_type
    }

    fun setDevice_token(device_token: String) {
        this.device_token = device_token
    }

    fun getDevice_token(): String {
        return device_token
    }

    fun getMobile(): String {
        return mobile
    }

    fun setMobile(mobile: String) {
        this.mobile = mobile
    }

    fun getPassword(): String {
        return password
    }

    fun setPassword(password: String) {
        this.password = password
    }
}