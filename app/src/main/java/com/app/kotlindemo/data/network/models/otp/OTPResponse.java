package com.app.kotlindemo.data.network.models.otp;

public class OTPResponse {

    /**
     * responseCode : 1
     * responseText : Succesfully send.
     * otp : 3121
     */

    private int responseCode;
    private String responseText;
    private int otp;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseText() {
        return responseText;
    }

    public void setResponseText(String responseText) {
        this.responseText = responseText;
    }

    public int getOtp() {
        return otp;
    }

    public void setOtp(int otp) {
        this.otp = otp;
    }
}
