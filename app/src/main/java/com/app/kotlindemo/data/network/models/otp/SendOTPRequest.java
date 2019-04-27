package com.app.kotlindemo.data.network.models.otp;

public class SendOTPRequest {


    /**
     * mobile : 1234567897
     */

    private String mobile;


    public SendOTPRequest(String mobile) {
        this.mobile = mobile;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
