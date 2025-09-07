package designpatterns.Adapter;

public class Client {
    public static void main(String[] args) {
        Phonepe Adapter = new Adapter("Icicibank");
        Adapter.payment("vinny","sippy",100);
    }
}
