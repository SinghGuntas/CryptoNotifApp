package org.example.service;

import org.example.model.Notification;
import org.example.model.TradeVolTypeNotifictaion;

public class NotificationService {

    private Notification notification;

    public NotificationService(Notification notification) {
        this.notification = notification;
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public Notification create(int btcPrice, int tradeVol, int todayHigh, int marketCap) {
        return new TradeVolTypeNotifictaion(btcPrice, tradeVol, todayHigh, marketCap);
    }

}
