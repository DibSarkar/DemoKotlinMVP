package com.app.kotlindemo.data.network.models.content_pages;

public class ContactResponse {


    /**
     * responseCode : 1
     * responseText : Succesfull
     * contact_data : {"contact_no":"7318255828","contact_address":""}
     */

    private int responseCode;
    private String responseText;
    private ContactDataBean contact_data;

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

    public ContactDataBean getContact_data() {
        return contact_data;
    }

    public void setContact_data(ContactDataBean contact_data) {
        this.contact_data = contact_data;
    }

    public static class ContactDataBean {
        /**
         * contact_no : 7318255828
         * contact_address :
         */

        private String contact_no;
        private String contact_address;

        public String getContact_no() {
            return contact_no;
        }

        public void setContact_no(String contact_no) {
            this.contact_no = contact_no;
        }

        public String getContact_address() {
            return contact_address;
        }

        public void setContact_address(String contact_address) {
            this.contact_address = contact_address;
        }
    }
}
