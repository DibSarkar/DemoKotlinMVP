package com.app.kotlindemo.data.network.models.myprofile;

public class MyProfileResponse {


    /**
     * responseCode : 1
     * responseText : User profile details.
     * responseData : {"user_data":{"f_name":"payal","l_name":"prachanda","email":"payal@gmail.com","mobile":"9008978966","prof_img":"http://192.168.5.51/carwashApp/upload/profile_image/1554287441_1546249385_new.jpg"}}
     */

    private int responseCode;
    private String responseText;
    private ResponseDataBean responseData;

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

    public ResponseDataBean getResponseData() {
        return responseData;
    }

    public void setResponseData(ResponseDataBean responseData) {
        this.responseData = responseData;
    }

    public static class ResponseDataBean {
        /**
         * user_data : {"f_name":"payal","l_name":"prachanda","email":"payal@gmail.com","mobile":"9008978966","prof_img":"http://192.168.5.51/carwashApp/upload/profile_image/1554287441_1546249385_new.jpg"}
         */

        private UserDataBean user_data;

        public UserDataBean getUser_data() {
            return user_data;
        }

        public void setUser_data(UserDataBean user_data) {
            this.user_data = user_data;
        }

        public static class UserDataBean {
            /**
             * f_name : payal
             * l_name : prachanda
             * email : payal@gmail.com
             * mobile : 9008978966
             * prof_img : http://192.168.5.51/carwashApp/upload/profile_image/1554287441_1546249385_new.jpg
             */

            private String f_name;
            private String l_name;
            private String email;
            private String mobile;
            private String prof_img;

            public String getF_name() {
                return f_name;
            }

            public void setF_name(String f_name) {
                this.f_name = f_name;
            }

            public String getL_name() {
                return l_name;
            }

            public void setL_name(String l_name) {
                this.l_name = l_name;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getProf_img() {
                return prof_img;
            }

            public void setProf_img(String prof_img) {
                this.prof_img = prof_img;
            }
        }
    }
}
