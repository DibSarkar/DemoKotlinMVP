package com.app.kotlindemo.data.network.models.packages;

import java.util.List;

public class PackageListResponse {


    /**
     * responseCode : 1
     * responseText : Data Received.
     * package_list : [{"pkg_id":1,"pkg_img":"http://192.168.5.51/carwashApp/public/upload/service_image/1553075995_1528351799.png","pkg_name":"car wash","pkg_desc":"test","pkg_amt":"204.00","approx_time":"4"},{"pkg_id":2,"pkg_img":"http://192.168.5.51/carwashApp/public/upload/service_image/1553681757_1528351790.jpg","pkg_name":"car sedan","pkg_desc":"test description","pkg_amt":"103.00","approx_time":"5"},{"pkg_id":3,"pkg_img":"http://192.168.5.51/carwashApp/public/upload/service_image/1553682107_1528285700.png","pkg_name":"test car wash data","pkg_desc":"test car wash data","pkg_amt":"3060.00","approx_time":"8"},{"pkg_id":4,"pkg_img":"http://192.168.5.51/carwashApp/public/upload/service_image/1553682175_1528285545.jpg","pkg_name":"demo car wash data","pkg_desc":"test","pkg_amt":"404.00","approx_time":"7"}]
     * next : 0
     */

    private int responseCode;
    private String responseText;
    private String next;
    private List<PackageListBean> package_list;

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

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }

    public List<PackageListBean> getPackage_list() {
        return package_list;
    }

    public void setPackage_list(List<PackageListBean> package_list) {
        this.package_list = package_list;
    }

    public static class PackageListBean {
        /**
         * pkg_id : 1
         * pkg_img : http://192.168.5.51/carwashApp/public/upload/service_image/1553075995_1528351799.png
         * pkg_name : car wash
         * pkg_desc : test
         * pkg_amt : 204.00
         * approx_time : 4
         */

        private int pkg_id;
        private String pkg_img;
        private String pkg_name;
        private String pkg_desc;
        private String pkg_amt;
        private String approx_time;
        private String pkg_thumb_img;

        public void setPkg_thumb_img(String pkg_thumb_img) {
            this.pkg_thumb_img = pkg_thumb_img;
        }

        public String getPkg_thumb_img() {
            return pkg_thumb_img;
        }

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

        public String getPkg_amt() {
            return pkg_amt;
        }

        public void setPkg_amt(String pkg_amt) {
            this.pkg_amt = pkg_amt;
        }

        public String getApprox_time() {
            return approx_time;
        }

        public void setApprox_time(String approx_time) {
            this.approx_time = approx_time;
        }
    }
}
