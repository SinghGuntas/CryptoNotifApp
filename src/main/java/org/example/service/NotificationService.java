package org.example.service;

import org.example.model.Notification;
import org.example.model.TradeVolTypeNotifictaion;

public class NotificationService {

    private Notification notification;

    public NotificationService() {
    }

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void create(int btcPrice, int tradeVol, int todayHigh, int marketCap) {
        TradeVolTypeNotifictaion tradeVolTypeNotifictaion = new TradeVolTypeNotifictaion(btcPrice, tradeVol, todayHigh, marketCap);
        setNotification(tradeVolTypeNotifictaion);
    }

}
