package Observable;

import Observer.NotificationAlertObserver;

public interface StockObservable {

    void add(NotificationAlertObserver observer);

    void remove(NotificationAlertObserver observer);

    void notifySubscribers();

    void setData(int data);

    int getData();
}
