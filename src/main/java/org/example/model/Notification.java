package org.example.model;

import java.time.LocalDateTime;
import java.util.UUID;

public abstract class Notification {
    private final String id;
    private NotificationMessage message;
    private final LocalDateTime createdAt;

    public Notification(NotificationMessage message) {
        this.message = message;
        id = UUID.randomUUID().toString();
        createdAt = LocalDateTime.now();
    }

    public Notification(Notification notification) {
        this.message = notification.message;
        id = UUID.randomUUID().toString();
        createdAt = LocalDateTime.now();
    }


    public String getId() {
        return id;
    }

    public NotificationMessage getMessage() {
        return message;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
