package designpatterns.ObserverDesign;

public class Phoneapp implements Observer{
    String name;
    public Phoneapp(String name) {
        this.name=name;
    }

    @Override
    public void update(float temp, float pressure) {
        System.out.println("PhoneDisplay → Temp: " + temp +", Pressure: " + pressure);
    }
}
