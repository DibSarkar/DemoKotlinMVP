package com.app.kotlindemo.data.network.models.booking;

import java.util.List;

public class BookingDetailsResponse {


    /**
     * responseCode : 1
     * responseText : Succesfull
     * booking_items : [{"pkg_id":"2","pkg_img":"","pkg_name":"Washing of Sedan Car","pkg_desc":"Lorem Ipsum","pkg_total":"560.00","pkg_duration":"5"},{"pkg_id":"3","pkg_img":"","pkg_name":"Washing of Sedan Car","pkg_desc":"Lorem Ipsum","pkg_total":"560.00","pkg_duration":"5"}]
     * booking_status : 1
     * assigned_engineer : {"name":"Dib Sarkar","prof_pic":"","rating":4,"phone":"8240379920"}
     * total_price : 720.00
     * sub_total : 700.00
     * total_tax : 20.00
     * address :
     * arrival_date : 15th April 2019
     * arrival_time : 11:50 am
     */

    private int responseCode;
    private String responseText;
    private String booking_status;
    private AssignedEngineerBean assigned_engineer;
    private String total_price;
    private String sub_total;
    private String total_tax;
    private String address;
    private String arrival_date;
    private String arrival_time;
    private String schedule_date;
    private String schedule_time;
    private String complete_date;
    private String complete_time;
    private String review;
    private int is_cancel;
    private float ratings;
    private List<BookingItemsBean> booking_items;
    private String payment_type;
    private String cancel_charge;


    public void setIs_cancel(int is_cancel) {
        this.is_cancel = is_cancel;
    }

    public int getIs_cancel() {
        return is_cancel;
    }


    public void setCancel_charge(String cancel_charge) {
        this.cancel_charge = cancel_charge;
    }

    public String getCancel_charge() {
        return cancel_charge;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public float getRatings() {
        return ratings;
    }

    public void setRatings(float ratings) {
        this.ratings = ratings;
    }

    public String getReview() {
        return review;
    }

    public void setComplete_date(String complete_date) {
        this.complete_date = complete_date;
    }

    public String getComplete_date() {
        return complete_date;
    }

    public void setComplete_time(String complete_time) {
        this.complete_time = complete_time;
    }

    public String getComplete_time() {
        return complete_time;
    }

    public String getSchedule_date() {
        return schedule_date;
    }

    public void setSchedule_date(String schedule_date) {
        this.schedule_date = schedule_date;
    }

    public String getSchedule_time() {
        return schedule_time;
    }

    public void setSchedule_time(String schedule_time) {
        this.schedule_time = schedule_time;
    }

    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }

    public String getPayment_type() {
        return payment_type;
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

    public String getBooking_status() {
        return booking_status;
    }

    public void setBooking_status(String booking_status) {
        this.booking_status = booking_status;
    }

    public AssignedEngineerBean getAssigned_engineer() {
        return assigned_engineer;
    }

    public void setAssigned_engineer(AssignedEngineerBean assigned_engineer) {
        this.assigned_engineer = assigned_engineer;
    }

    public String getTotal_price() {
        return total_price;
    }

    public void setTotal_price(String total_price) {
        this.total_price = total_price;
    }

    public String getSub_total() {
        return sub_total;
    }

    public void setSub_total(String sub_total) {
        this.sub_total = sub_total;
    }

    public String getTotal_tax() {
        return total_tax;
    }

    public void setTotal_tax(String total_tax) {
        this.total_tax = total_tax;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public void setArrival_time(String arrival_time) {
        this.arrival_time = arrival_time;
    }

    public List<BookingItemsBean> getBooking_items() {
        return booking_items;
    }

    public void setBooking_items(List<BookingItemsBean> booking_items) {
        this.booking_items = booking_items;
    }

    public static class AssignedEngineerBean {
        /**
         * name : Dib Sarkar
         * prof_pic :
         * rating : 4
         * phone : 8240379920
         */

        private String name;
        private String prof_pic;
        private String phone;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getProf_pic() {
            return prof_pic;
        }

        public void setProf_pic(String prof_pic) {
            this.prof_pic = prof_pic;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public static class BookingItemsBean {
        /**
         * pkg_id : 2
         * pkg_img :
         * pkg_name : Washing of Sedan Car
         * pkg_desc : Lorem Ipsum
         * pkg_total : 560.00
         * pkg_duration : 5
         */

        private int pkg_id;
        private String pkg_img;
        private String pkg_name;
        private String pkg_desc;
        private String pkg_total;
        private String pkg_duration;


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

        public String getPkg_desc() {
            return pkg_desc;
        }

        public void setPkg_desc(String pkg_desc) {
            this.pkg_desc = pkg_desc;
        }

        public String getPkg_total() {
            return pkg_total;
        }

        public void setPkg_total(String pkg_total) {
            this.pkg_total = pkg_total;
        }

        public String getPkg_duration() {
            return pkg_duration;
        }

        public void setPkg_duration(String pkg_duration) {
            this.pkg_duration = pkg_duration;
        }
    }
}
