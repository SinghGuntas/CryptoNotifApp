package org.example.exceptions;

import org.example.model.Notification;

public class NotificationNotFound extends Exception {
    public NotificationNotFound() {
        super("Notif not found");
    }
}
