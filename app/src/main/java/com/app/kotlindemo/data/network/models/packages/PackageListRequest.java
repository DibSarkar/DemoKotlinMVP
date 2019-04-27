package com.app.kotlindemo.data.network.models.packages;

public class PackageListRequest {


    /**
     * user_id : 1
     * lat : 22.5765
     * lng : 88.4796
     * current_page : 1
     */

    private String user_id;
    private String lat;
    private String lng;
    private String current_page;


    public PackageListRequest(String user_id, String lat, String lng, String current_page) {
        this.user_id = user_id;
        this.lat = lat;
        this.lng = lng;
        this.current_page = current_page;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getCurrent_page() {
        return current_page;
    }

    public void setCurrent_page(String current_page) {
        this.current_page = current_page;
    }
}
