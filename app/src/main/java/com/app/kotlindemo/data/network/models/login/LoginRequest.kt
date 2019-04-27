package com.app.kotlindemo.data.network.models.login


data class LoginRequest(var mobile: String, var password: String, var device_token: String, var device_type: String)
