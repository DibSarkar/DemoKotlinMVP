package com.app.kotlindemo.data.network.models.booking;

public class BookingRatingRequest {


    /**
     * user_id : 1
     * booking_Id :
     * rating : 0
     * review : Lorem Ipsum
     */

    private String user_id;
    private String booking_Id;
    private float rating;
    private String review;

    public BookingRatingRequest(String user_id, String booking_Id, float rating, String review) {
        this.user_id = user_id;
        this.booking_Id = booking_Id;
        this.rating = rating;
        this.review = review;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getBooking_Id() {
        return booking_Id;
    }

    public void setBooking_Id(String booking_Id) {
        this.booking_Id = booking_Id;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
