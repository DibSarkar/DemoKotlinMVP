/*
 * Copyright (C) 2017 MINDORKS NEXTGEN PRIVATE LIMITED
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://mindorks.com/license/apache-v2
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */

package com.app.kotlindemo.base

import android.annotation.TargetApi
import android.app.ProgressDialog
import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import android.support.annotation.StringRes
import android.support.design.widget.Snackbar
import android.support.v4.content.ContextCompat
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.TextView
import android.widget.Toast
import butterknife.Unbinder
import com.app.kotlindemo.R
import com.app.kotlindemo.di.components.ActivityComponent
import com.app.kotlindemo.di.components.DaggerActivityComponent
import com.app.kotlindemo.di.modules.ActivityModule
import com.app.kotlindemo.shared.Dirt2Clean
import com.app.kotlindemo.utils.CommonUtils
import com.app.kotlindemo.utils.NetworkUtils
import timber.log.Timber

abstract class BaseActivity : AppCompatActivity(), MvpView /*BaseFragment.Callback*/ {

    private var mProgressDialog: ProgressDialog? = null

    var activityComponent: ActivityComponent? = null
        private set

    private var mUnBinder: Unbinder? = null

    override val isNetworkConnected: Boolean
        get() = NetworkUtils.isNetworkConnected(applicationContext)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityComponent = DaggerActivityComponent.builder()
            .activityModule(ActivityModule(this))
            .applicationComponent((application as Dirt2Clean).getApplicationComponent())
            .build()

    }


    @TargetApi(Build.VERSION_CODES.M)
    fun requestPermissionsSafely(permissions: Array<String>, requestCode: Int) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(permissions, requestCode)
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    fun hasPermission(permission: String): Boolean {
        return Build.VERSION.SDK_INT < Build.VERSION_CODES.M || checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED
    }

    override fun showLoading() {
        hideLoading()
        mProgressDialog = CommonUtils.showLoadingDialog(this)
    }

    override fun hideLoading() {
        if (mProgressDialog != null && mProgressDialog!!.isShowing) {
            mProgressDialog!!.cancel()
        }
    }

    fun showSnackBar(message: String) {
        val snackbar = Snackbar.make(
            findViewById(android.R.id.content),
            message, Snackbar.LENGTH_SHORT
        )
        val sbView = snackbar.view
        val textView = sbView
            .findViewById(android.support.design.R.id.snackbar_text) as TextView
        textView.setTextColor(ContextCompat.getColor(this, android.R.color.white))
        snackbar.show()
    }

    override fun onError(message: String) {
        hideKeyboard()
        if (message != null) {
            showErrorToast(message)
        } else {
            showErrorToast("Error Message is null")
        }
    }

    override fun onError(@StringRes resId: Int) {
        onError(getString(resId))
    }

    override fun showMessage(message: String) {
        hideKeyboard()
        if (message != null) {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Some error", Toast.LENGTH_LONG).show()
        }
    }

    fun showErrorToast(message: String?) {
        hideKeyboard()
        if (message != null) {
            Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(this, "Some error", Toast.LENGTH_LONG).show()
        }
    }

    override fun showMessage(@StringRes resId: Int) {
        showMessage(getString(resId))
    }

    override fun hideKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }

    override fun logOut() {
        /*  Intent i = new Intent(this, SignInActivity.class);
        i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(i);*/

        /*LockManager<CustomPinActivity> lockManager = LockManager.getInstance();
        lockManager.getAppLock().setLogoId(R.mipmap.ic_launcher);
        lockManager.getAppLock().setShouldShowForgot(true);
        lockManager.getAppLock().setTimeout(Constants.TIMEOUT_MILLIES);
        lockManager.getAppLock().addIgnoredActivity(SplashActivity.class);
        lockManager.getAppLock().addIgnoredActivity(SignInActivity.class);
        lockManager.getAppLock().addIgnoredActivity(LoginEmailActivity.class);*/
    }


    fun setUnBinder(unBinder: Unbinder) {
        mUnBinder = unBinder
    }

    override fun onDestroy() {

        if (mUnBinder != null) {
            mUnBinder!!.unbind()
        }
        super.onDestroy()
    }

    override fun showAlert(message: String) {
        try {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.app_name)
            builder.setIcon(R.mipmap.ic_launcher)
            builder.setMessage(message)
            builder.setCancelable(false)
            builder.setPositiveButton("Ok") { dialog, which -> dialog.dismiss() }
            val alert = builder.create()
            alert.show()
        } catch (e: Exception) {
            Timber.tag(TAG).e(e)
        }

    }


    override fun showInactiveUserAlert(message: String) {
        try {
            val builder = AlertDialog.Builder(this)
            builder.setTitle(R.string.app_name)
            builder.setIcon(R.mipmap.ic_launcher)
            builder.setMessage(message)
            builder.setCancelable(false)
            builder.setPositiveButton("Ok") { dialog, which ->
                dialog.dismiss()
                logOut()
            }
            val alert = builder.create()
            alert.show()
        } catch (e: Exception) {
            Timber.e(e)
        }

    }

    companion object {


        val TAG = BaseActivity::class.java.simpleName
    }

    /*protected abstract void setUp();*/


    //App Lock related code
}

