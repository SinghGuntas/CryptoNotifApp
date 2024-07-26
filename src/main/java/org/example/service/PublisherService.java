package org.example.service;

import org.example.enums.NotificationStatus;
import org.example.exceptions.NotificationAlreadySentException;
import org.example.exceptions.NotificationNotFound;
import org.example.model.Notification;
import org.example.model.NotificationMessage;
import org.example.model.Publisher;
import org.example.model.Subscriber;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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

     public void removeNotification(Notification notification) throws NotificationNotFound, NotificationAlreadySentException {
        if (!publisher.notifStatusMap.containsKey(notification))
            throw new NotificationNotFound();
        if (publisher.notifStatusMap.get(notification).equals(NotificationStatus.SENT)) {
            throw new NotificationAlreadySentException();
        }
        publisher.notifStatusMap.remove(notification);
     }

     public List<Notification> list(NotificationStatus notificationStatus) {
        return publisher.notifStatusMap.entrySet().stream().filter(notificationNotificationStatusEntry ->
            notificationNotificationStatusEntry.getValue().equals(notificationStatus)
        ).map(Map.Entry::getKey).collect(Collectors.toList());
     }

}
