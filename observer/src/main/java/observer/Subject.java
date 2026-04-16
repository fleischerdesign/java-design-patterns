package observer;

/**
 * The Subject interface manages the list of observers.
 * It provides methods to attach, detach, and notify them.
 */
public interface Subject {
    void attach(Observer observer);
    void detach(Observer observer);
    void notifyObservers(String news);
}
