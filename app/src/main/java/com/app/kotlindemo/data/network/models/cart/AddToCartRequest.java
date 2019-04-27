package com.app.kotlindemo.data.network.models.cart;

public class AddToCartRequest {


    /**
     * user_id : 1
     * pkg_id : 2
     */

    private String user_id;
    private String pkg_id;


    public AddToCartRequest(String user_id, String pkg_id) {
        this.user_id = user_id;
        this.pkg_id = pkg_id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getPkg_id() {
        return pkg_id;
    }

    public void setPkg_id(String pkg_id) {
        this.pkg_id = pkg_id;
    }
}
