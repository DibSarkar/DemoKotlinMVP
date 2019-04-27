package com.app.kotlindemo.data.network.models.cart;

public class AddressRequest {


    /**
     * user_id : 3
     * address : Y8, EP Block
     * city : Kolkata
     * state : West Bengal
     * pin : 700091
     * country : India
     * loc_lat :
     * loc_lng :
     * type : 2
     */

    private String user_id;
    private String address;
    private String city;
    private String state;
    private String pin;
    private String country;
    private String loc_lat;
    private String loc_lng;
    private String type;

    public AddressRequest(String user_id, String address, String city, String state, String pin, String country, String loc_lat, String loc_lng, String type) {
        this.user_id = user_id;
        this.address = address;
        this.city = city;
        this.state = state;
        this.pin = pin;
        this.country = country;
        this.loc_lat = loc_lat;
        this.loc_lng = loc_lng;
        this.type = type;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLoc_lat() {
        return loc_lat;
    }

    public void setLoc_lat(String loc_lat) {
        this.loc_lat = loc_lat;
    }

    public String getLoc_lng() {
        return loc_lng;
    }

    public void setLoc_lng(String loc_lng) {
        this.loc_lng = loc_lng;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
