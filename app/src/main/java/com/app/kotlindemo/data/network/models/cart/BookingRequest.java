package com.app.kotlindemo.data.network.models.cart;

public class BookingRequest {


    /**
     * user_id : 1
     * cartId : 101
     * pref_date : 20-03-19
     * pref_time : 12:00 am
     * pay_type : 1
     */

    private String user_id;
    private int cartId;
    private String pref_date;
    private String pref_time;
    private String pay_type;
    private String addressId;
    private String trans_status;
    private String trans_id;

    public BookingRequest(String user_id, int cartId, String pref_date, String pref_time, String pay_type,String addressId,String trans_status,String trans_id) {
        this.user_id = user_id;
        this.cartId = cartId;
        this.pref_date = pref_date;
        this.pref_time = pref_time;
        this.pay_type = pay_type;
        this.addressId=addressId;
        this.trans_status=trans_status;
        this.trans_id=trans_id;
    }

    public void setTrans_id(String trans_id) {
        this.trans_id = trans_id;
    }

    public String getTrans_id() {
        return trans_id;
    }

    public void setAddressId(String addressId) {
        this.addressId = addressId;
    }

    public String getAddressId() {
        return addressId;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getPref_date() {
        return pref_date;
    }

    public void setPref_date(String pref_date) {
        this.pref_date = pref_date;
    }

    public String getPref_time() {
        return pref_time;
    }

    public void setPref_time(String pref_time) {
        this.pref_time = pref_time;
    }

    public String getPay_type() {
        return pay_type;
    }

    public void setPay_type(String pay_type) {
        this.pay_type = pay_type;
    }
}
