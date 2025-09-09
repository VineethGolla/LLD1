package Interface;

import java.sql.SQLOutput;

public class LightBulb implements Switchable{
    public void turnOn() {
        System.out.println("Light Bulb is ON");
    }
    public void turnOff() {
        System.out.println("Light Bulb is OFF");
    }
}
