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

package com.app.kotlindemo.data.prefs

import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager

import com.app.kotlindemo.di.ApplicationContext

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class AppPreferencesHelper : PreferencesHelper {


    private val PREF_KEY_CURRENT_USER_ID = "PREF_KEY_CURRENT_USER_ID"
    private val PREF_KEY_CURRENT_FIRST_NAME = "PREF_KEY_CURRENT_FIRST_NAME"
    private val PREF_KEY_CURRENT_LAST_NAME = "PREF_KEY_CURRENT_LAST_NAME"
    private val PREF_KEY_CURRENT_USER_MOB = "PREF_KEY_CURRENT_MOB"
    private val PREF_KEY_CURRENT_USER_EMAIL = "PREF_KEY_CURRENT_USER_EMAIL"
    private val PREF_KEY_CURRENT_USER_GENDER = "PREF_KEY_CURRENT_USER_GENDER"
    private val PREF_KEY_CURRENT_USER_REGTYPE = "PREF_KEY_CURRENT_USER_RGTYPE"
    private val PREF_KEY_CURRENT_USER_PROFILE_PIC_URL = "PREF_KEY_CURRENT_USER_PROFILE_PIC_URL"

    val KEY_SP_LAST_INTERACTION_TIME = "KEY_SP_LAST_INTERACTION_TIME"

    private var mPrefs: SharedPreferences

    @Inject
    constructor(@ApplicationContext context: Context){
        mPrefs = PreferenceManager.getDefaultSharedPreferences(context)
    }


    override fun getCurrentUserId(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_ID, "")
    }

    override fun setCurrentUserId(userId: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_ID, userId).apply()
    }

    override fun getCurrentFirstName(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_FIRST_NAME, "")
    }

    override fun setCurrentFirstName(firstName: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_FIRST_NAME, firstName).apply()
    }

    override fun getCurrentLastName(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_LAST_NAME, "")
    }

    override fun setCurrentLastName(lastName: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_LAST_NAME, lastName).apply()
    }

    override fun getCurrentMobileNumber(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_MOB, "")
    }

    override fun setCurrentMobileNumber(mobile: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_MOB, mobile).apply()
    }

    override fun getCurrentUserEmail(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_EMAIL, "")
    }

    override fun setCurrentUserEmail(email: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_EMAIL, email).apply()
    }

    override fun getCurrentUserProfilePicUrl(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_PROFILE_PIC_URL, "")
    }

    override fun setCurrentUserProfilePicUrl(profilePicUrl: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_PROFILE_PIC_URL, profilePicUrl).apply()
    }

    override fun setCurrentUserGender(gender: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_GENDER, gender).apply()
    }

    override fun getCurrentUserGender(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_GENDER, "")
    }

    override fun getLastIntaractionTimestamp(): Long {
        return mPrefs.getLong(KEY_SP_LAST_INTERACTION_TIME, 0)
    }

    override fun setLastIntaractionTimestamp(timeStamp: Long) {
        mPrefs.edit().putLong(KEY_SP_LAST_INTERACTION_TIME, timeStamp).apply()
    }

    override fun setRegistrationType(registrationType: String) {
        mPrefs.edit().putString(PREF_KEY_CURRENT_USER_REGTYPE, registrationType).apply()
    }

    override fun getRegistrationType(): String {
        return mPrefs.getString(PREF_KEY_CURRENT_USER_REGTYPE, "")
    }

    override fun destroyPref() {
        mPrefs.edit().clear().apply()
    }

}
