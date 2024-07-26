package org.example.model;

public class TradeVolTypeNotifictaion extends Notification {

     private final int btcPrice;
     private final int tradeVol;
     private final int todayHigh;
     private final int marketCap;

    public TradeVolTypeNotifictaion(int btcPrice, int tradeVol, int todayHigh, int marketCap) {
        super(new NotificationMessage(btcPrice + " " + tradeVol + " " + todayHigh + " " + marketCap));
        this.btcPrice = btcPrice;
        this.tradeVol = tradeVol;
        this.todayHigh = todayHigh;
        this.marketCap = marketCap;
    }

    public TradeVolTypeNotifictaion(TradeVolTypeNotifictaion notification) {
        super();
        this.btcPrice = notification.btcPrice;
    }

    public int getBtcPrice() {
        return btcPrice;
    }

    public int getTradeVol() {
        return tradeVol;
    }

    public int getTodayHigh() {
        return todayHigh;
    }

    public int getMarketCap() {
        return marketCap;
    }

}
