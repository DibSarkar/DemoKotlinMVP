package com.app.kotlindemo.data

import com.app.kotlindemo.data.network.ApiHelper
import com.app.kotlindemo.data.prefs.PreferencesHelper

/**
 * Created by svk on 5/6/17.
 */

interface DataManager : ApiHelper, PreferencesHelper {

    fun logout()


}
