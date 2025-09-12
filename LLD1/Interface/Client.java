package LLD1.Interface;

public class Client {
    public static void main(String[] args) {
        Switchable fan = new Fan();
        Switch f = new Switch(fan);
        f.operate();
        Switchable bulb = new LightBulb();
        Switch s = new Switch(bulb);
        s.operate();
    }

}
