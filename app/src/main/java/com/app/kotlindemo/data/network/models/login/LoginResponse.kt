package com.app.kotlindemo.data.network.models.login

class LoginResponse {

    private var responseCode: Int = 0
    private lateinit var responseText: String
    private var user_id: Int = 0
    private lateinit var email: String
    private lateinit var mobile: String


    fun getResponseCode(): Int {
        return responseCode
    }

    fun setResponseCode(responseCode: Int) {
        this.responseCode = responseCode
    }

    fun getResponseText(): String {
        return responseText
    }

    fun setResponseText(responseText: String) {
        this.responseText = responseText
    }

    fun getUser_id(): Int {
        return user_id
    }

    fun setUser_id(user_id: Int) {
        this.user_id = user_id
    }

    fun getEmail(): String {
        return email
    }

    fun setEmail(email: String) {
        this.email = email
    }

    fun getMobile(): String {
        return mobile
    }

    fun setMobile(mobile: String) {
        this.mobile = mobile
    }


}