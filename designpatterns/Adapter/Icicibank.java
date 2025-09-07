package designpatterns.Adapter;

public class Icicibank {
    void send(String from, String to, double amount) {
        System.out.print("Bank transfer of " +amount +" successfully sent from " + from + " to " + to);
    }
}
