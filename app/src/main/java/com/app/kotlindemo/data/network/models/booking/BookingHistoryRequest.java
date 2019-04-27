package com.app.kotlindemo.data.network.models.booking;

public class BookingHistoryRequest {


    /**
     * user_id : 2
     * current_page : 1
     */

    private String user_id;
    private String current_page;


    public BookingHistoryRequest(String user_id, String current_page) {
        this.user_id = user_id;
        this.current_page = current_page;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(String current_page) {
        this.current_page = current_page;
    }
}
