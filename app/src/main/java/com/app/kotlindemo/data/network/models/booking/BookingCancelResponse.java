package com.app.kotlindemo.data.network.models.booking;

public class BookingCancelResponse {


    /**
     * responseCode : 1
     * responseText : CancelledBooking
     * status : 4
     */

    private int responseCode;
    private String responseText;
    private String status;

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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
