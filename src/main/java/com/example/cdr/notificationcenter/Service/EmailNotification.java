package com.example.cdr.notificationcenter.Service;

import com.example.cdr.notificationcenter.Model.Notification;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class EmailNotification implements NotificationInterface{
    private final KafkaTemplate<String,String> kafkaTemplate;
    @Value("${spring.kafka.topic}")
    private String KafkaTopic;

    public EmailNotification(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    @Override
    public String getType() {
        return "Email";
    }

    @Override
    public void send(Notification notification) {
        kafkaTemplate.send(KafkaTopic, notification.getMessage());
    }
}
