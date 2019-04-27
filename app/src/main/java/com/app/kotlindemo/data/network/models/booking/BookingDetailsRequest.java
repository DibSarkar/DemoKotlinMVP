package com.app.kotlindemo.data.network.models.booking;

public class BookingDetailsRequest {


    /**
     * user_id : 6
     * booking_id : 1
     */

    private String user_id;
    private String booking_id;


    public BookingDetailsRequest(String user_id, String booking_id) {
        this.user_id = user_id;
        this.booking_id = booking_id;
    }


    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBooking_id() {
        return booking_id;
    }

    public void setBooking_id(String booking_id) {
        this.booking_id = booking_id;
    }
}
