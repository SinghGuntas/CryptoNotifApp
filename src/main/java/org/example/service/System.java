package org.example.service;

import org.example.model.Notification;
import org.example.model.Subscriber;
import org.example.model.TradeVolTypeNotifictaion;

import java.util.List;

public class System {
    private final NotificationService notificationService;
    private final PublisherService publisherService;
    private final SubscriberService subscriberService;

    public System(NotificationService notificationService, PublisherService publisherService, SubscriberService subscriberService) {
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

    public void delete(Notification notification) {
        publisherService.
    }

    public List<Notification> list() {

    }

}
