package com.app.kotlindemo.data.network.models.forgot_pass;

public class ForgotPassRequest {


    /**
     * email : test@gmail.com
     */

    private String mobile;


    public ForgotPassRequest(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
