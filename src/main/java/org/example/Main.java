package org.example;

public class Main {
    public static void main(String[] args) {


    }
}


//
// We would like you to create a crypto notification app. The features it should include:
//
//
//
//Create a server which will be able to take in the following rest APIs
//
//
//
// Create a notification. Line items may include current price of BTC, market trade volume, intra day high price, market cap
// Send a notification to an email
// List sent notifications (sent, outstanding, failed etc.)
// Delete a notification

// Notification, User, System, Publisher, Subscriber

//Type1 -> u1, u2, u3

//Abstract Notification -

// id
// Message
// createdAt
// sentAt

//getMessage()

// TRADE_VOL_NOTIF extent Notificiation
// int btcPrice,
// int tradeVol
// int todayHigh
// int marketCap

//getMessage()

// User implement Subscriber
// id
// email
// update(Message message) -> Print the message text with user id

//System
// List<Subscribers>
// Published publisher

//send() -> call publisher.notify
//addSubscriber(Subscriber)
//removeSubscriber(S)
// delete(notificationId)
// listNotifi(NotifStatus)
// create(btc, tradeVol, todayHigh, marketCap);

//NotificationService
//Notification notification
//setNotif
//getNotif
//createNotif()

//Publisher
// HashMap<notifStatus, List<Notification>> notifStatusMap;
// notify(Notification, Subscriber)


//interface Subscriber
//update(Message)


// Message
//String text

//enum notifStatus
// SENT, OUTSTANDING, FAILED, Initialised
