package Observable;

import Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservable implements StockObservable{
    int stockCount;
    List<NotificationAlertObserver> observers = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver observer:observers){
            observer.update();
        }
    }

    @Override
    public void setData(int data) {
        if(stockCount == 0) {
            stockCount = data;
            notifySubscribers();
        }
    }

    @Override
    public int getData() {
        return stockCount;
    }
}
