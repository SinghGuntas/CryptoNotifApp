package org.example.model;

import org.example.enums.NotificationStatus;

import java.util.HashMap;
import java.util.List;

public class Publisher {
    public HashMap<Notification, NotificationStatus> notifStatusMap;
    private static Publisher publisher = null;
    private Publisher() {
        this.notifStatusMap = new HashMap<>();
    }

    public static Publisher getInstance() {
        if (publisher == null) {
            publisher = new Publisher();
        }
        return publisher;
    }


}
