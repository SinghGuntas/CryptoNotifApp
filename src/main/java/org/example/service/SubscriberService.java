package org.example.service;

import org.example.model.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriberService {
    private List<Subscriber> subscribersList;

    public SubscriberService() {
        this.subscribersList = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribersList.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribersList.remove(subscriber);
    }

    public List<Subscriber> getSubscribersList() {
        return subscribersList;
    }
}
