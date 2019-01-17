package observer.subject;

import observer.observer.Observer;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author gclikejuice
 **/
public interface Subject {
    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
