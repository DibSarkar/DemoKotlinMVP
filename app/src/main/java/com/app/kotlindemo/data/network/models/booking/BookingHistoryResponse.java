package com.app.kotlindemo.data.network.models.booking;

import java.util.List;

public class BookingHistoryResponse {


    /**
     * responseCode : 1
     * responseText : Succesfull.
     * booking_List : [{"booking_id":1,"total":"784.00","ratings":0,"order_status":"1"},{"booking_id":12,"total":"224.00","ratings":0,"order_status":"1"},{"booking_id":16,"total":"448.00","ratings":0,"order_status":"1"},{"booking_id":17,"total":"448.00","ratings":0,"order_status":"1"}]
     */

    private int responseCode;
    private String responseText;
    private List<BookingListBean> booking_List;
    private String next;


    public void setNext(String next) {
        this.next = next;
    }

    public String getNext() {
        return next;
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

    public List<BookingListBean> getBooking_List() {
        return booking_List;
    }

    public void setBooking_List(List<BookingListBean> booking_List) {
        this.booking_List = booking_List;
    }

    public static class BookingListBean {
        /**
         * booking_id : 1
         * total : 784.00
         * ratings : 0
         * order_status : 1
         */

        private int booking_id;
        private String total;
        private int ratings;
        private String order_status;

        public int getBooking_id() {
            return booking_id;
        }

        public void setBooking_id(int booking_id) {
            this.booking_id = booking_id;
        }

        public String getTotal() {
            return total;
        }

        public void setTotal(String total) {
            this.total = total;
        }

        public int getRatings() {
            return ratings;
        }

        public void setRatings(int ratings) {
            this.ratings = ratings;
        }

        public String getOrder_status() {
            return order_status;
        }

        public void setOrder_status(String order_status) {
            this.order_status = order_status;
        }
    }
}
