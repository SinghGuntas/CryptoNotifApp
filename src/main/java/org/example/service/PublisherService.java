package org.example.service;

import org.example.enums.NotificationStatus;
import org.example.exceptions.NotificationNotFound;
import org.example.model.Notification;
import org.example.model.NotificationMessage;
import org.example.model.Publisher;
import org.example.model.Subscriber;

import java.util.ArrayList;

public class PublisherService implements IPublisherService{

    private final Publisher publisher = Publisher.getInstance();

    @Override
    public void notify(Notification notification, Subscriber subscriber) {
         publisher.notifStatusMap.put(notification, NotificationStatus.OUTSTANDING);
         try {
             subscriber.update(notification.getMessage());
             publisher.notifStatusMap.put(notification, NotificationStatus.SENT);
         } catch (Exception exception) {
             publisher.notifStatusMap.put(notification, NotificationStatus.FAILED);
         }
     }

     public void removeNotification(Notification notification) {
        if (!publisher.notifStatusMap.containsKey(notification))
            throw new NotificationNotFound("");
        publisher.notifStatusMap.remove(notification);
     }

}
