package LLD1.Interface;

public class Switch {
    public Switchable device;
    public Switch(Switchable device) {
        this.device = device;
    }
    void operate() {
        device.turnOn();
        device.turnOff();
    }
}
