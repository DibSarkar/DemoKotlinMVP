package com.app.kotlindemo.data.network.models;

public class SendUserRequest {

    /**
     * user_id : 6
     */

    private String user_id;

    public SendUserRequest(String user_id) {
        this.user_id = user_id;
    }


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
}
