package com.app.kotlindemo.data.network.models.cart;

public class AddressCheckRequest {


    /**
     * user_id : 6
     * addressId : 1
     */

    private String user_id;
    private String address_id;


    public AddressCheckRequest(String user_id, String address_id) {
        this.user_id = user_id;
        this.address_id = address_id;
    }



    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAddress_id() {
        return address_id;
    }

    public void setAddress_id(String address_id) {
        this.address_id = address_id;
    }
}
