package org.example.model;

public class NotificationMessage {
    public NotificationMessage(String text) {
        this.text = text;
    }

    private final String text;

    public String getText() {
        return text;
    }
}
