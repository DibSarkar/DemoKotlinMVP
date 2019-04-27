package com.app.kotlindemo.data.network.models.myprofile;

public class EditProfileResponse {


    /**
     * responseCode : 1
     * responseText : Succesfully updated
     * email : payal@gmail.co
     * mobile : 9008978966
     */

    private int responseCode;
    private String responseText;
    private String email;
    private String mobile;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
