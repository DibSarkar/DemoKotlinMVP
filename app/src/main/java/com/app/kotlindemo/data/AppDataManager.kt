package com.app.kotlindemo.data

import android.content.Context
import com.app.kotlindemo.data.network.ApiHelper
import com.app.kotlindemo.data.network.models.CommonResponse
import com.app.kotlindemo.data.network.models.SendUserRequest
import com.app.kotlindemo.data.network.models.booking.*
import com.app.kotlindemo.data.network.models.cart.*
import com.app.kotlindemo.data.network.models.content_pages.ContactResponse
import com.app.kotlindemo.data.network.models.content_pages.ContentRequest
import com.app.kotlindemo.data.network.models.forgot_pass.ForgotPassRequest
import com.app.kotlindemo.data.network.models.login.LoginRequest
import com.app.kotlindemo.data.network.models.login.LoginResponse
import com.app.kotlindemo.data.network.models.myprofile.ChangePassRequest
import com.app.kotlindemo.data.network.models.myprofile.EditProfileResponse
import com.app.kotlindemo.data.network.models.myprofile.MyProfileResponse
import com.app.kotlindemo.data.network.models.otp.OTPResponse
import com.app.kotlindemo.data.network.models.otp.SendOTPRequest
import com.app.kotlindemo.data.network.models.packages.PackageListRequest
import com.app.kotlindemo.data.network.models.packages.PackageListResponse
import com.app.kotlindemo.data.network.models.register.RegisterResponse
import com.app.kotlindemo.data.prefs.PreferencesHelper
import com.app.kotlindemo.di.ApplicationContext


import javax.inject.Inject

import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call

/**
 * Created by svk on 5/6/17.
 */
class AppDataManager : DataManager {

    //To change initializer of created properties use File | Settings | File Templates.
    //To change initializer of created properties use File | Settings | File Templates.
    //To change initializer of created properties use File | Settings | File Templates.

    var mApiHelper: ApiHelper
    var mPreferencesHelper: PreferencesHelper
     var mContext: Context

    @Inject constructor(
        mApiHelper: ApiHelper,
        mPreferencesHelper: PreferencesHelper,
        @ApplicationContext mContext: Context
    ) {
        this.mApiHelper = mApiHelper
        this.mPreferencesHelper = mPreferencesHelper
        this.mContext = mContext
    }

    override fun logout() {
        destroyPref() //To change body of created functions use File | Settings | File Templates.
    }
    override fun getCurrentUserId(): String {
        return mPreferencesHelper.getCurrentUserId()
    }

    override fun setCurrentUserId(userId: String) {

        mPreferencesHelper.setCurrentUserId(userId)
    }

    override fun getCurrentUserEmail(): String {
        return mPreferencesHelper.getCurrentUserEmail()
    }

    override fun setCurrentUserEmail(email: String) {
        mPreferencesHelper.setCurrentUserEmail(email)
    }

    override fun getCurrentUserProfilePicUrl(): String {
        return mPreferencesHelper.getCurrentUserProfilePicUrl()
    }

    override fun setCurrentUserProfilePicUrl(profilePicUrl: String) {
        mPreferencesHelper.setCurrentUserProfilePicUrl(profilePicUrl)
    }

    override fun getCurrentFirstName(): String {
        return mPreferencesHelper.getCurrentFirstName()
    }

    override fun setCurrentFirstName(firstName: String) {
        mPreferencesHelper.setCurrentFirstName(firstName)
    }

    override fun getCurrentLastName(): String {
        return mPreferencesHelper.getCurrentLastName()
    }

    override fun setCurrentLastName(lastName: String) {
        mPreferencesHelper.setCurrentLastName(lastName)
    }

    override fun setCurrentUserGender(gender: String) {
        mPreferencesHelper.setCurrentUserGender(gender)
    }

    override fun getCurrentUserGender(): String {
        return mPreferencesHelper.getCurrentUserGender()
    }

    override fun getCurrentMobileNumber(): String {
        return mPreferencesHelper.getCurrentMobileNumber()
    }

    override fun setCurrentMobileNumber(mobileNumber: String) {
        mPreferencesHelper.setCurrentMobileNumber(mobileNumber)
    }

    override fun setLastIntaractionTimestamp(timeStamp: Long) {
        mPreferencesHelper.setLastIntaractionTimestamp(timeStamp)
    }

    override fun getLastIntaractionTimestamp(): Long {
        return mPreferencesHelper.getLastIntaractionTimestamp()
    }

    override fun setRegistrationType(registrationType: String) {
        mPreferencesHelper.setRegistrationType(registrationType)
    }

    override fun getRegistrationType(): String {
        return mPreferencesHelper.getRegistrationType()
    }

    override fun destroyPref() {

        mPreferencesHelper.destroyPref()
    }


    override fun sendOTP(req: SendOTPRequest): Call<OTPResponse> {
        return mApiHelper.sendOTP(req)
    }

    override fun register(
        profile_pic: MultipartBody.Part,
        f_name: RequestBody,
        l_name: RequestBody,
        email: RequestBody,
        mobile: RequestBody,
        password: RequestBody,
        device_type: RequestBody,
        device_token: RequestBody
    ): Call<RegisterResponse> {
        return mApiHelper.register(profile_pic, f_name, l_name, email, mobile, password, device_type, device_token)
    }

    override fun editProfile(
        prof_img: MultipartBody.Part,
        f_name: RequestBody,
        l_name: RequestBody,
        email: RequestBody,
        mobile: RequestBody,
        user_id: RequestBody
    ): Call<EditProfileResponse> {
        return mApiHelper.editProfile(prof_img, f_name, l_name, email, mobile, user_id)
    }

    override fun login(req: LoginRequest): Call<LoginResponse> {
        return mApiHelper.login(req)
    }

    override fun forgotPass(req: ForgotPassRequest): Call<CommonResponse> {
        return mApiHelper.forgotPass(req)
    }

    override fun getPackages(req: PackageListRequest): Call<PackageListResponse> {
        return mApiHelper.getPackages(req)
    }

    override fun getProfileInfo(req: SendUserRequest): Call<MyProfileResponse> {
        return mApiHelper.getProfileInfo(req)
    }

    override fun changePass(req: ChangePassRequest): Call<CommonResponse> {
        return mApiHelper.changePass(req)
    }

    override fun addtoCart(req: AddToCartRequest): Call<CommonResponse> {
        return mApiHelper.addtoCart(req)
    }

    override fun getCartStatus(req: AddToCartRequest): Call<PackageCartStatusResponse> {
        return mApiHelper.getCartStatus(req)
    }

    override fun getCartList(req: SendUserRequest): Call<CartListResponse> {
        return mApiHelper.getCartList(req)
    }

    override fun deleteCartItem(req: DeleteCartItemRequest): Call<CommonResponse> {
        return mApiHelper.deleteCartItem(req)
    }

    override fun changeAddress(req: AddressRequest): Call<CommonResponse> {
        return mApiHelper.changeAddress(req)
    }

    override fun confirmBooking(req: BookingRequest): Call<CommonResponse> {
        return mApiHelper.confirmBooking(req)
    }

    override fun clearCart(req: SendUserRequest): Call<CommonResponse> {
        return mApiHelper.clearCart(req)
    }

    override fun getBookingHistory(req: BookingHistoryRequest): Call<BookingHistoryResponse> {
        return mApiHelper.getBookingHistory(req)
    }

    override fun getBookingDetails(req: BookingDetailsRequest): Call<BookingDetailsResponse> {
        return mApiHelper.getBookingDetails(req)
    }

    override fun cancelBooking(req: BookingDetailsRequest): Call<BookingCancelResponse> {
        return mApiHelper.cancelBooking(req)
    }

    override fun sendRating(req: BookingRatingRequest): Call<BookingRatingResponse> {
        return mApiHelper.sendRating(req)
    }

    override fun getContents(req: ContentRequest): Call<CommonResponse> {
        return mApiHelper.getContents(req)
    }

    override fun checkAddress(req: AddressCheckRequest): Call<CommonResponse> {
        return mApiHelper.checkAddress(req)
    }

    override val contactData: Call<ContactResponse>
        get() = TODO("not implemented")









}

