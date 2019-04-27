package com.app.kotlindemo.data.network.models.register;

public class RegisterResponse {


    /**
     * responseCode : 1
     * responseText : Registration successful
     * user_id : 8
     * email : test2@gmail.como
     * mobile : 12345678948
     */

    private int responseCode;
    private String responseText;
    private int user_id;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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
