package com.example.cdr.notificationcenter.Controller;

import com.example.cdr.notificationcenter.Model.Notification;
import com.example.cdr.notificationcenter.Service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    private final NotificationService notificationService;

    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public void sendNotification(@RequestBody Notification notification) {
        notificationService.sendNotification(notification);
    }
}
