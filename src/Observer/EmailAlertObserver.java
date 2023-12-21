package Observer;

import Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable observable; //defined here so if we want data of observable

    public EmailAlertObserver(StockObservable observable, String email){
        this.observable = observable;
        this.email = email;
    }

    @Override
    public void update() {
        sendMail(email,"product in stock hurry up!");
    }

    private void sendMail(String email, String msg) {
        System.out.println("email sent to : " + email + " with message " + msg);
        System.out.println(observable.getData());
    }
}
