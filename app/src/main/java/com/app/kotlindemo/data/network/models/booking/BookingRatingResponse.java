package com.app.kotlindemo.data.network.models.booking;

public class BookingRatingResponse {


    /**
     * responseCode : 1
     * responseText : Succesfully submitted.
     * rating : 4
     * review : Lorem Ipsum
     */

    private int responseCode;
    private String responseText;
    private float rating;
    private String review;

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

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}
