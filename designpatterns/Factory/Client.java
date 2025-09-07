package designpatterns.Factory;

public class Client {
    public static void main(String[] args) throws Exception {
        Factory factory = new Factory("Ios");
        Notification notify=factory.CreatePlatform();
        notify.notify("dumdumdum: do dodum");
    }
}
