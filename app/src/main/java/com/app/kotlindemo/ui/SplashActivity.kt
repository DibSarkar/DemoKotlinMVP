package com.app.kotlindemo.ui

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.view.Window
import android.view.WindowManager
import com.app.kotlindemo.R
import com.app.kotlindemo.base.BaseActivity
import com.app.kotlindemo.ui.login.LoginActivity

class SplashActivity : BaseActivity() {
    override fun showMessage(message: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(
                R.anim.slideinfromright,
                R.anim.slideouttoleft
            )
            finish()

        }, 3000)

    }


}