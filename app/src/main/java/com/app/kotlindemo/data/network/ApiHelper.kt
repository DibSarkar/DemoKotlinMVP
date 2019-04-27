package com.app.kotlindemo.data.network


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
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

/**
 * Created by svk on 5/6/17.
 */

interface ApiHelper {

    @get:POST("contact")
    val contactData: Call<ContactResponse>


    @POST("send_otp")
    fun sendOTP(@Body req: SendOTPRequest): Call<OTPResponse>

    @Multipart
    @POST("signup")
    fun register(
        @Part profile_pic: MultipartBody.Part,
        @Part("f_name") f_name: RequestBody,
        @Part("l_name") l_name: RequestBody,
        @Part("email") email: RequestBody,
        @Part("mobile") mobile: RequestBody,
        @Part("password") password: RequestBody,
        @Part("device_type") device_type: RequestBody,
        @Part("device_token") device_token: RequestBody
    ): Call<RegisterResponse>

    @Multipart
    @POST("editProfile")
    fun editProfile(
        @Part prof_img: MultipartBody.Part,
        @Part("f_name") f_name: RequestBody,
        @Part("l_name") l_name: RequestBody,
        @Part("email") email: RequestBody,
        @Part("mobile") mobile: RequestBody,
        @Part("user_id") user_id: RequestBody
    ): Call<EditProfileResponse>

    @POST("login")
    fun login(@Body req: LoginRequest): Call<LoginResponse>

    @POST("forgot_pass")
    fun forgotPass(@Body req: ForgotPassRequest): Call<CommonResponse>

    @POST("packageList")
    fun getPackages(@Body req: PackageListRequest): Call<PackageListResponse>

    @POST("getProfile")
    fun getProfileInfo(@Body req: SendUserRequest): Call<MyProfileResponse>

    @POST("changePassword")
    fun changePass(@Body req: ChangePassRequest): Call<CommonResponse>

    @POST("addToCart")
    fun addtoCart(@Body req: AddToCartRequest): Call<CommonResponse>

    @POST("getCartStatus")
    fun getCartStatus(@Body req: AddToCartRequest): Call<PackageCartStatusResponse>

    @POST("cartList")
    fun getCartList(@Body req: SendUserRequest): Call<CartListResponse>

    @POST("deleteCart")
    fun deleteCartItem(@Body req: DeleteCartItemRequest): Call<CommonResponse>

    @POST("changeAddress")
    fun changeAddress(@Body req: AddressRequest): Call<CommonResponse>

    @POST("booking")
    fun confirmBooking(@Body req: BookingRequest): Call<CommonResponse>

    @POST("clearCart")
    fun clearCart(@Body req: SendUserRequest): Call<CommonResponse>

    @POST("getBookingHistory")
    fun getBookingHistory(@Body req: BookingHistoryRequest): Call<BookingHistoryResponse>

    @POST("bookingDetails")
    fun getBookingDetails(@Body req: BookingDetailsRequest): Call<BookingDetailsResponse>

    @POST("cancel")
    fun cancelBooking(@Body req: BookingDetailsRequest): Call<BookingCancelResponse>

    @POST("submitRating")
    fun sendRating(@Body req: BookingRatingRequest): Call<BookingRatingResponse>

    @POST("all_page")
    fun getContents(@Body req: ContentRequest): Call<CommonResponse>

    @POST("area_check")
    fun checkAddress(@Body req: AddressCheckRequest): Call<CommonResponse>



}
