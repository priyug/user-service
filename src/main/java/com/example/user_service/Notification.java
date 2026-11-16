package com.example.user_service;

public class Notification {

    public String getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(String notificationId) {
        this.notificationId = notificationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private String notificationId;
    private  String description;

    public Notification(String notificationId, String description) {
        this.notificationId = notificationId;
        this.description = description;
    }


}
