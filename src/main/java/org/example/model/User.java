package org.example.model;

public class User implements Subscriber{
    private final String id;
    private final String email;

    public User(String id, String email) {
        this.id = id;
        this.email = email;
    }

    @Override
    public void update(NotificationMessage notificationMessage) {
        System.out.println("Sent notification with message " + notificationMessage.getText() + " to " + this.email);
    }
}
