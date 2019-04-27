package com.app.kotlindemo.ui.login

import com.app.kotlindemo.base.BasePresenter
import com.app.kotlindemo.data.DataManager
import com.app.kotlindemo.data.network.models.login.LoginRequest
import com.app.kotlindemo.data.network.models.login.LoginResponse
import com.app.kotlindemo.utils.Constants
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import timber.log.Timber
import java.io.IOException
import java.util.regex.Pattern
import javax.inject.Inject


 class LoginPresenter<V : LoginMvpView> @Inject
 constructor(dataManager:DataManager):BasePresenter<V>(dataManager), LoginMvpPresenter<V> {
     companion object {
         val TAG = LoginPresenter::class.java.simpleName
     }

     val EMAIL_ADDRESS_PATTERN = Pattern.compile(
     "[a-zA-Z0-9+._%-+]{1,256}" +
     "@" +
     "[a-zA-Z0-9][a-zA-Z0-9-]{0,64}" +
     "(" +
     "." +
     "[a-zA-Z0-9][a-zA-Z0-9-]{0,25}" +
     ")+"
    )

     override fun onOpenForgotAlertUI() {
         TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
     }

     override fun onLogin(mobile: String, pass: String, device_token: String, device_type: String) {
         if (mobile != "") {
             if (mobile.length == 10) {
                 if (pass != "") {
                     if (getMvpView()?.isNetworkConnected!!) {
                         if (device_token != null) {

                             getMvpView()?.showLoading()
                             val loginRequest = LoginRequest(mobile, pass, device_token, device_type)

                            dataManager.login(loginRequest).enqueue(object : Callback<LoginResponse> {

                                 override fun onResponse(call: Call<LoginResponse>, response: Response<LoginResponse>) {
                                     getMvpView()?.hideLoading()

                                     if (response.isSuccessful) {
                                         if (response.body()!!.getResponseCode() == 1) {

                                             dataManager.setCurrentUserId(response.body()!!.getUser_id().toString())
                                             dataManager.setCurrentMobileNumber(response.body()!!.getMobile())
                                             dataManager.setCurrentUserEmail(response.body()!!.getEmail())

                                             getMvpView()?.showMessage(response.body()!!.getResponseText())
                                             getMvpView()?.gotoHome()

                                         } else {
                                             getMvpView()?.showMessage(response.body()!!.getResponseText())
                                             //getMvpView().getCommentList(new ArrayList<CommentsResponse.ResponseDataBean.CommentsBean>(),"","");
                                         }
                                     } else {
                                         getMvpView()?.onError(response.code().toString() + ":" + response.message())
                                     }
                                 }

                                 override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                                     getMvpView()?.hideLoading()

                                     Timber.tag(TAG).w(t)

                                     if (t is IOException) {
                                         if (t.message != null) {
                                             getMvpView()?.onError(t.message!!)
                                         } else {
                                             getMvpView()?.onError("Network Failure")
                                         }
                                         return
                                     }
                                     getMvpView()?.onError("Retrofit failure.Check LOG")
                                 }
                             })
                         } else run {
                             getMvpView()?.hideLoading()
                             getMvpView()?.showMessage("Some error occured.")
                         }
                     } else run { getMvpView()?.showMessage("No internet connection") }

                 } else run { getMvpView()?.showMessage("Please enter password") }
             } else run { getMvpView()?.showMessage("Invalid Mobile No.") }
         } else run { getMvpView()?.showMessage("Please enter Mobile No.") }

     }

     override fun ongotoOTP() {
    getMvpView()?.gotoOTP()

    }

    private fun checkEmail(m:String):Boolean {
    return EMAIL_ADDRESS_PATTERN.matcher(m).matches()
    }

     override fun sendForgotPassword(phone:String) {

            if (phone != "")
            {
            if (phone.length == 10)
            {
            sendForgotPass(phone)

            }
            else
            {
            getMvpView()?.showMessage("Invalid mobile no")
            }
            }
            else
            {
            getMvpView()?.showMessage("Please enter email-id")
            }
    }


    private fun sendForgotPass(mobile:String) {

    }


    }
