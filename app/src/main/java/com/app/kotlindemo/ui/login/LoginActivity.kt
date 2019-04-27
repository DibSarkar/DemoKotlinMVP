package com.app.kotlindemo.ui.login

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast
import butterknife.BindView
import butterknife.ButterKnife
import butterknife.OnClick
import com.app.kotlindemo.R
import com.app.kotlindemo.base.BaseActivity
import com.app.kotlindemo.ui.EnterMobileNumberActivity
import com.app.kotlindemo.utils.Constants
import dagger.android.AndroidInjection
import javax.inject.Inject

class LoginActivity : BaseActivity(), LoginMvpView {


    @BindView(R.id.et_mobile)
    lateinit var et_mobile: EditText

    @BindView(R.id.et_pass)
    lateinit var et_pass: EditText


    @Inject
    lateinit var loginPresenter: LoginPresenter<LoginMvpView>
    var dialog: Dialog? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )


        setUnBinder(ButterKnife.bind(this))


        activityComponent?.inject(this)
        setUp()
    }

    protected fun setUp() {
     loginPresenter!!.onAttach(this)
        //println("toknfirebase" + " " + FirebaseInstanceId.getInstance().getToken())
    }

    override fun gotoOTP() {
        val intent = Intent(this, EnterMobileNumberActivity::class.java)
        intent.putExtra("openScreen", Constants.OPEN_FROM_LOGIN)
        startActivity(intent)
        overridePendingTransition(
            R.anim.slideinfromright,
            R.anim.slideouttoleft
        )
    }

    override fun gotoHome() {
      /*  val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        overridePendingTransition(
            R.anim.slideinfromright,
            R.anim.slideouttoleft
        )
        finish()*/
    }

    override fun openForgotAlertUI() {
        showDialog()
    }

    override fun forgotPasswordDone() {

        if (dialog != null) {
            if (dialog!!.isShowing) {
                dialog!!.dismiss()
            }
        }


    }

    @OnClick(R.id.btn_submit, R.id.tv_signup, R.id.tv_signup1, R.id.tv_forgot)
    fun onClick(v: View) {
        when (v.id) {
            R.id.btn_submit -> loginPresenter!!.onLogin(
                et_mobile!!.text.toString(),
                et_pass!!.text.toString(),
                "12345",
                Constants.DEVICE_TYPE
            )
            R.id.tv_signup -> loginPresenter!!.ongotoOTP()

            R.id.tv_signup1 -> loginPresenter!!.ongotoOTP()

            R.id.tv_forgot ->

                loginPresenter!!.onOpenForgotAlertUI()
        }
    }

     override fun onDestroy() {
        loginPresenter!!.onDetach()
        super.onDestroy()
    }


    override fun onBackPressed() {
        super.onBackPressed()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
            finishAffinity()
        }
        else{
            finish()
        }
    }

    private fun showDialog() {

        dialog = Dialog(this)
        dialog!!.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog!!.window!!.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog!!.setContentView(R.layout.layout_forgot_password)
        val btn_submit = dialog!!.findViewById<Button>(R.id.btn_submit)
        val et_phoneText = dialog!!.findViewById<EditText>(R.id.et_phone)

        val iv_cross = dialog!!.findViewById<ImageView>(R.id.iv_cross)

        iv_cross.setOnClickListener { dialog!!.dismiss() }

        btn_submit.setOnClickListener { loginPresenter!!.sendForgotPassword(et_phoneText.text.toString()) }

       // dialog!!.window!!.attributes.windowAnimations = R.style.DialogTheme //style id

        dialog!!.show()

    }

}
