package designpatterns.Factory;

public class Client {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory("Ios");
        Notification notify=factory.CreatePlatform();
        notify.notify("Choose flutter dude");

        Factory factory2 = new Factory("Android");
        Notification notify2=factory2.CreatePlatform();
        notify2.notify("Choose flutter dude :)");
    }
}
