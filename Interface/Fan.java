package Interface;

public class Fan implements Switchable{
    public void turnOn() {
        System.out.println("Fan is ON");
    }
    public void turnOff() {
        System.out.println("Fan is OFF and light is turning ON");
    }
}
