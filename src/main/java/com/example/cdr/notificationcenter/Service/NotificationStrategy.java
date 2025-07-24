package com.example.cdr.notificationcenter.Service;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class NotificationStrategy {
    private final Map<String,NotificationInterface>strategies = new HashMap<>();
    public NotificationStrategy(List<NotificationInterface> strategyList) {
        for (NotificationInterface strategy : strategyList) {
            strategies.put(strategy.getType(),strategy);
        }
    }
    public NotificationInterface getStrategy(String type) {
        return strategies.get(type);
    }

}
