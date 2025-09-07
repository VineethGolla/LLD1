package designpatterns.Factory;

import java.sql.SQLOutput;

public class Android extends Notification{

    @Override
    public void notify(String message) {
        System.out.println("Android message: "+message);
    }
}
