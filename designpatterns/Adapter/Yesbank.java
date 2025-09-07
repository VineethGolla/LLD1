package designpatterns.Adapter;

public class Yesbank {
    void transfer(String from, String to, double amount) {
        System.out.print("Bank transfer of " +amount +" successful from " + from + " to " + to);
    }
}
