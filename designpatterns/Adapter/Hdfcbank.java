package designpatterns.Adapter;

public class Hdfcbank {
    void UPI(String from, String to, double amount) {
        System.out.print("Bank transfer of " +amount +" successfully done from " + from + " to " + to);
    }
}
