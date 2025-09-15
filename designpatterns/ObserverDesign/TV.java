package designpatterns.ObserverDesign;

public class TV implements Observer{
    String name;
    public TV(String name) {
        this.name=name;
    }

    @Override
    public void update(float temp, float pressure) {
        System.out.println("TVDisplay → Temp: " + temp + ", Pressure: " + pressure);
    }
}
