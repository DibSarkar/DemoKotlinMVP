package com.app.kotlindemo.data.network.models.cart;

public class DeleteCartItemRequest {


    /**
     * user_id : 1
     * id : 3
     */

    private String user_id;
    private String id;


    public DeleteCartItemRequest(String user_id, String id) {
        this.user_id = user_id;
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
