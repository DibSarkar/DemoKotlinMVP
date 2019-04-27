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

package com.app.kotlindemo.di.modules

import android.content.Context
import android.support.v7.app.AppCompatActivity

import com.app.kotlindemo.di.ActivityContext
import com.app.kotlindemo.di.PerActivity
import com.app.kotlindemo.ui.login.LoginMvpPresenter
import com.app.kotlindemo.ui.login.LoginMvpView
import com.app.kotlindemo.ui.login.LoginPresenter
import dagger.Module
import dagger.Provides

import java.util.ArrayList

@Module
class ActivityModule(private val mActivity: AppCompatActivity) {

    @Provides
    @ActivityContext
    internal fun provideContext(): Context {
        return mActivity
    }

    @Provides
    internal fun provideActivity(): AppCompatActivity {
        return mActivity
    }

    @Provides
    @PerActivity
    internal fun provideLoginMvpPresenter(presenter: LoginPresenter<LoginMvpView>): LoginMvpPresenter<LoginMvpView> {
        return presenter
    }

    /* @Provides
    @PerActivity
    LoginMvpPresenter<LoginMvpView> provideLoginMvpPresenter(LoginPresenter<LoginMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    VerifyOTPMvpPresenter<VerifyOTPMvpView> provideOTPMvpPresenter(VerifyOTPPresenter<VerifyOTPMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    SendOTPMvpPresenter<SendOTPMvpView> provideSendOTPMvpPresenter(SendOTPPresenter<SendOTPMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    BookingHistoryMvpPresenter<BookingHistoryMvpView> provideBookingHistoryMvpPresenter(BookingHistoryPresenter<BookingHistoryMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    BookingDetailsMvpPresenter<BookingDetailsMvpView> provideBookingDetailsMvpPresenter(BookingDetailsPresenter<BookingDetailsMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    RegisterMvpPresenter<RegisterMvpView> provideRegisterMvpPresenter(RegisterPresenter<RegisterMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    SplashMvpPresenter<SplashMvpView> provideSplashMvpPresenter(SplashPresenter<SplashMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    HomeMvpPresenter<HomeMvpView> provideHomeMvpPresenter(HomePresenter<HomeMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    MyAccountMvpPresenter<MyAccountMvpView> provideMyAccountMvpPresenter(MyAccountPresenter<MyAccountMvpView> presenter) {
        return presenter;
    }


    @Provides
    @PerActivity
    PackageDetailsMvpPresenter<PackageDetailsMvpView> providePackageDetailsMvpPresenter(PackageDetailsPresenter<PackageDetailsMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    CartMvpPresenter<CartMvpView> provideCartMvpPresenter(CartPresenter<CartMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    AddressMvpPresenter<AddressMvpView> provideAddressMvpPresenter(AddressPresenter<AddressMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    ContactMvpPresenter<ContactMvpView> provideContactMvpPresenter(ContactPresenter<ContactMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    ContentMvpPresenter<ContentMvpView> provideContentMvpPresenter(ContentPresenter<ContentMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    NotificationMvpPresenter<NotificationMvpView> provideNotificationMvpPresenter(NotificationPresenter<NotificationMvpView> presenter) {
        return presenter;
    }

    @Provides
    @PerActivity
    OrderSuccessMvpPresenter<OrderSuccessMvpView> provideOrderSuccessMvpPresenter(OrderSuccessPresenter<OrderSuccessMvpView> presenter) {
        return presenter;
    }




    @Provides
    PackageListAdapter providePackageListAdapter() {
        return new PackageListAdapter(new ArrayList<PackageListResponse.PackageListBean>());
    }

    @Provides
    CartAdapter provideCartAdapter() {
        return new CartAdapter(new ArrayList<CartListResponse.CartListBean>());
    }

    @Provides
    BookingHistoryAdapter provideBookingHistoryAdapter() {
        return new BookingHistoryAdapter(new ArrayList<BookingHistoryResponse.BookingListBean>());
    }

    @Provides
    BookingItemsAdapter provideBookingItemsAdapter() {
        return new BookingItemsAdapter(new ArrayList<BookingDetailsResponse.BookingItemsBean>());
    }


    @Provides
    NotificationAdapter provideNotificationAdapter() {
        return new NotificationAdapter(new ArrayList<BookingHistoryResponse.BookingListBean>());
    }
*/

}
