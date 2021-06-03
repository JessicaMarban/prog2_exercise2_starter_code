package trafficlight.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<>();

    public void notifyObserver() {

        for (Observer obs : this.observers) {
            obs.update();
        }
    }

    public void addObserver (Observer observer) {
        this.observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

}
