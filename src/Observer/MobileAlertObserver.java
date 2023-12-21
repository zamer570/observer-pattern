package Observer;

import Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {

    String mobile;
    StockObservable observable; //defined here so if we want data of observable

    public MobileAlertObserver(StockObservable observable, String mobile){
        this.observable = observable;
        this.mobile = mobile;
    }

    @Override
    public void update() {
        sendMessage("stock is up hurry up");
    }

    void sendMessage(String msg){
        System.out.println("message sent to mobile: " + mobile + " with message " + msg);
        System.out.println(observable.getData());
    }
}
