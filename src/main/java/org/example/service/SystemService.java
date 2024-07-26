package org.example.service;

import org.example.enums.NotificationStatus;
import org.example.exceptions.NotificationAlreadySentException;
import org.example.exceptions.NotificationNotFound;
import org.example.model.Notification;
import org.example.model.Subscriber;
import org.example.model.TradeVolTypeNotifictaion;

import java.util.List;

public class SystemService {
    private final NotificationService notificationService;
    private final PublisherService publisherService;
    private final SubscriberService subscriberService;

    public SystemService(NotificationService notificationService, PublisherService publisherService, SubscriberService subscriberService) {
        this.notificationService = notificationService;
        this.publisherService = publisherService;
        this.subscriberService = subscriberService;
    }

    public void send() {
        TradeVolTypeNotifictaion notification = (TradeVolTypeNotifictaion) notificationService.getNotification();
        for (Subscriber subscriber : subscriberService.getSubscribersList()) {
            publisherService.notify(new TradeVolTypeNotifictaion(notification), subscriber);
        }
    }

    public void delete(Notification notification) throws NotificationAlreadySentException, NotificationNotFound {
        publisherService.removeNotification(notification);
    }

    public List<Notification> list(NotificationStatus notificationStatus) {
        return publisherService.list(notificationStatus);
    }

}
