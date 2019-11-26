package main.action.observe.improve;

import java.util.ArrayList;

/**
 * CREATED BY yangyifan
 * Date: 2019/11/26
 */
public class WeatherData implements Subject {
    private float t;
    private float p;
    private float h;
    private ArrayList<Observer> observers;

    WeatherData(){
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (Observer observer : observers) {
            observer.update(t,p,h);
        }
    }
    public void setData(float t, float p, float h) {
        this.t = t;
        this.p = p;
        this.h = h;
        notifyObserver();
    }
}
