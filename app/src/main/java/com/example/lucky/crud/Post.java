package com.example.lucky.crud;

public class Post {

    private String postId;
    private String userId;
    private String body;
    private String title;

    public Post() {
    }

    public Post(String userid, String postid, String title, String body) {
        this.postId = postid;
        this.userId = userid;
        this.body = body;
        this.title = title;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
