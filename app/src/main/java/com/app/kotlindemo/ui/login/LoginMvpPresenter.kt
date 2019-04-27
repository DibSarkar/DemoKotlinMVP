package com.app.kotlindemo.ui.login

import com.app.kotlindemo.base.MvpPresenter

interface LoginMvpPresenter<V : LoginMvpView> : MvpPresenter<V> {

    fun ongotoOTP()
    fun onLogin(mobile: String, pass: String, device_token: String, device_type: String)
    fun onOpenForgotAlertUI()
    fun sendForgotPassword(phone: String)


}
