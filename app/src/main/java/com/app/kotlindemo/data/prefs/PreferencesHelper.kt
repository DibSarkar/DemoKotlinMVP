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

/**
 * Created by janisharali on 27/01/17.
 */

interface PreferencesHelper {

    fun getCurrentUserId(): String

    fun setCurrentUserId(userId: String)

    fun getCurrentFirstName(): String

    fun setCurrentFirstName(firstName: String)

    fun getCurrentLastName(): String

    fun setCurrentLastName(lastName: String)

    fun getCurrentMobileNumber(): String

    fun setCurrentMobileNumber(lastName: String)

    fun getCurrentUserEmail(): String

    fun setCurrentUserEmail(email: String)

    fun getCurrentUserProfilePicUrl(): String

    fun setCurrentUserProfilePicUrl(profilePicUrl: String)

    fun getCurrentUserGender(): String

    fun setCurrentUserGender(gender: String)

    fun getLastIntaractionTimestamp(): Long

    fun setLastIntaractionTimestamp(timeStamp: Long)

    fun destroyPref()

    fun setRegistrationType(registrationType: String)

    fun getRegistrationType(): String


}
