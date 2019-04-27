package com.app.kotlindemo.ui.login

import com.app.kotlindemo.base.MvpView

interface LoginMvpView : MvpView {

    fun gotoOTP()
    fun gotoHome()
    fun openForgotAlertUI()
    fun forgotPasswordDone()


}
