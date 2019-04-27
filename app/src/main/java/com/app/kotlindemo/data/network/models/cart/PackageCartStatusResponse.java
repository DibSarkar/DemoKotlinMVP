package com.app.kotlindemo.data.network.models.cart;

public class PackageCartStatusResponse {


    /**
     * responseCode : 1
     * responseText : Success
     * cartAdded : true
     */

    private int responseCode;
    private String responseText;
    private boolean cartAdded;

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

    public boolean isCartAdded() {
        return cartAdded;
    }

    public void setCartAdded(boolean cartAdded) {
        this.cartAdded = cartAdded;
    }
}
