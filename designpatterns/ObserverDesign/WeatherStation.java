package designpatterns.ObserverDesign;

import java.util.ArrayList;
//import java.util.Observer;

public class WeatherStation implements Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    float temp;
    float pressure;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers) {
            o.update(temp,pressure);
        }
    }

    public void setweather(float temp, float pressure) {
        this.temp=temp;
        this.pressure=pressure;
        notifyObservers();
    }
}
