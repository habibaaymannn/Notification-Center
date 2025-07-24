package com.example.cdr.notificationcenter.Service;

import com.example.cdr.notificationcenter.Model.Notification;

public interface NotificationInterface {
    String getType();
    void send(Notification notification);
}
