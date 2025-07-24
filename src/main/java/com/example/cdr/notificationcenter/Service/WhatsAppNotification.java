package com.example.cdr.notificationcenter.Service;

import com.example.cdr.notificationcenter.Model.Notification;
import com.example.cdr.notificationcenter.Repository.NotificationRepository;
import org.springframework.stereotype.Component;

@Component
public class WhatsAppNotification implements NotificationInterface {
    private final NotificationRepository notificationRepository;
    public WhatsAppNotification(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    @Override
    public void send(Notification notification) {
        notificationRepository.save(notification);
    }
    @Override
    public String getType() {
        return "WhatsApp";
    }
}
