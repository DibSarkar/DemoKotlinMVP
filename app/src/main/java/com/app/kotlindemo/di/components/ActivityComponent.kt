package com.app.kotlindemo.di.components


import com.app.kotlindemo.di.PerActivity
import com.app.kotlindemo.di.modules.ActivityModule
import com.app.kotlindemo.ui.EnterMobileNumberActivity
import com.app.kotlindemo.ui.login.LoginActivity
import com.app.kotlindemo.ui.SplashActivity
import dagger.Component

@PerActivity
@Component(dependencies = [ApplicationComponent::class], modules = [ActivityModule::class])
interface ActivityComponent {

    fun inject(activity: SplashActivity)

    fun inject(activity: LoginActivity)

    fun inject(activity: EnterMobileNumberActivity)

    /*  void inject(VerifyOTPActivity activity);

    void inject(RegistrationActivity activity);

    void inject(HomeActivity activity);

    void inject(PackageDetailsActivity activity);

    void inject(CartActivity activity);

    void inject(BookingHistoryActivity activity);

    void inject(BookingDetailsActivity activity);

    void inject(OrderSuccessActivity activity);

    void inject(NotificationActivity activity);

    void inject(NotificationDetailsActivity activity);

    void inject(MyAccountActivity activity);

    void inject(AddressActivity activity);

    void inject(AboutActivity activity);

    void inject(PrivacyActivity activity);

    void inject(TermsActivity activity);

    void inject(ContactActivity activity);*/

}