package com.example.cdr.notificationcenter.Service;

import com.example.cdr.notificationcenter.Model.Notification;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final NotificationStrategy strategy;
    public NotificationService(NotificationStrategy strategy) {
        this.strategy = strategy;
    }
    public void sendNotification(Notification notification) {
        String channel = notification.getChannel();
        NotificationInterface handler = strategy.getStrategy(channel);
        if (handler == null) {
            throw new IllegalArgumentException("No handler found for channel " + channel);
        }
        handler.send(notification);
    }
}
