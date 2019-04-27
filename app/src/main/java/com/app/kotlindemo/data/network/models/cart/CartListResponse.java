package com.app.kotlindemo.data.network.models.cart;

import java.util.List;

public class CartListResponse {


    /**
     * responseCode : 1
     * responseText : Succesfull
     * cart_list : [{"id":1,"pkg_id":2,"pkg_img":"http://192.168.5.51/carwashApp/public/upload/service_image/1554197612_1541663625.jpg","pkg_name":"Car clean","pkg_amt":"560.00","approx_time":"5"},{"id":2,"pkg_id":1,"pkg_img":"http://192.168.5.51/carwashApp/public/upload/service_image/1554197326_1541664368.jpg","pkg_name":"Car wash","pkg_amt":"224.00","approx_time":"4"}]
     * cartId : 391
     * total_price : 784
     * cart_address :
     */

    private int responseCode;
    private String responseText;
    private int cartId;
    private String cart_total;
    private String cart_address;
    private List<CartListBean> cart_list;
    private int address_id;
    private String total_tax;
    private String sub_total;

    public String getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    public String getSub_total() {
        return sub_total;
    }

    public void setSub_total(String sub_total) {
        this.sub_total = sub_total;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getAddress_id() {
        return address_id;
    }
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

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCart_total() {
        return cart_total;
    }

    public void setCart_total(String cart_total) {
        this.cart_total = cart_total;
    }

    public String getCart_address() {
        return cart_address;
    }

    public void setCart_address(String cart_address) {
        this.cart_address = cart_address;
    }

    public List<CartListBean> getCart_list() {
        return cart_list;
    }

    public void setCart_list(List<CartListBean> cart_list) {
        this.cart_list = cart_list;
    }

    public static class CartListBean {
        /**
         * id : 1
         * pkg_id : 2
         * pkg_img : http://192.168.5.51/carwashApp/public/upload/service_image/1554197612_1541663625.jpg
         * pkg_name : Car clean
         * pkg_amt : 560.00
         * approx_time : 5
         */

        private int id;
        private int pkg_id;
        private String pkg_img;
        private String pkg_name;
        private String pkg_amt;
        private String approx_time;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getPkg_id() {
            return pkg_id;
        }

        public void setPkg_id(int pkg_id) {
            this.pkg_id = pkg_id;
        }

        public String getPkg_img() {
            return pkg_img;
        }

        public void setPkg_img(String pkg_img) {
            this.pkg_img = pkg_img;
        }

        public String getPkg_name() {
            return pkg_name;
        }

        public void setPkg_name(String pkg_name) {
            this.pkg_name = pkg_name;
        }

        public String getPkg_amt() {
            return pkg_amt;
        }

        public void setPkg_amt(String pkg_amt) {
            this.pkg_amt = pkg_amt;
        }

        public String getApprox_time() {
            return approx_time;
        }

        public void setApprox_time(String approx_time) {
            this.approx_time = approx_time;
        }
    }
}
