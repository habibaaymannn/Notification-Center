package com.example.cdr.notificationcenter.Service;

import com.example.cdr.notificationcenter.Model.Notification;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.FileWriter;
import java.io.IOException;

@Component
public class SMSNotification implements NotificationInterface {
    @Value("${spring.notification.sms.path}")
    private String filePath;
    @Override
    public void send(Notification notification) {
        try (FileWriter writer = new FileWriter(filePath, true)) {
            writer.write(notification.getMessage());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public String getType() {
        return "SMS";
    }
}
