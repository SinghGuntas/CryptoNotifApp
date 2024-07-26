package org.example.exceptions;

public class NotificationAlreadySentException extends Exception {

    public NotificationAlreadySentException() {
        super("Notification already sent");
    }
}
