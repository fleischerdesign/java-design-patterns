package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * NewsAgency is our concrete Subject.
 * It maintains a list of observers and notifies them when news is set.
 */
public class NewsAgency implements Subject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void attach(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String news) {
        // We iterate through the list and call update on each observer
        for (Observer observer : observers) {
            observer.update(news);
        }
    }

    public void setNews(String news) {
        notifyObservers(news);
    }
}
