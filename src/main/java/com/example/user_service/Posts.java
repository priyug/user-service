package com.example.user_service;

public class Posts
{

    private String postId;
    private String detail;

    public Posts(String postId, String detail) {
        this.postId = postId;
        this.detail = detail;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }








}
