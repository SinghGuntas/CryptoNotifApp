package org.example.service;

import org.example.model.Notification;
import org.example.model.Subscriber;

public interface IPublisherService {
    void notify(Notification notification, Subscriber subscriber);
}
