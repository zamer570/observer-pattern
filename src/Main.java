import Observable.IphoneObservable;
import Observable.StockObservable;
import Observer.EmailAlertObserver;
import Observer.MobileAlertObserver;
import Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StockObservable iphoneObservable = new IphoneObservable();

        NotificationAlertObserver n1 = new EmailAlertObserver(iphoneObservable,"sarthak@gmail.com");
        NotificationAlertObserver n2 = new MobileAlertObserver(iphoneObservable, "888103998237");
        NotificationAlertObserver n3 = new EmailAlertObserver(iphoneObservable,"safasdf@gmail.com");

        iphoneObservable.add(n1);
        iphoneObservable.add(n2);
        iphoneObservable.add(n3);

//        iphoneObservable.setData(0);
        iphoneObservable.setData(10);
    }
}