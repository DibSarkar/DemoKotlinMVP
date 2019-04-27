package com.app.kotlindemo.data.network.models.content_pages;

public class ContentRequest {

    /**
     * slug : about_us
     */

    private String page_slug;

    public ContentRequest(String page_slug) {
        this.page_slug = page_slug;
    }


    public String getPage_slug() {
        return page_slug;
    }

    public void setPage_slug(String page_slug) {
        this.page_slug = page_slug;
    }
}
