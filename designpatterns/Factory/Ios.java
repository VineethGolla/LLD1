package designpatterns.Factory;

public class Ios extends Notification{

    @Override
    public void notify(String message) {
        System.out.println("Ios message: "+message);
    }
}
