package designpatterns.Singleton;

import static java.util.Currency.getInstance;

public class Client {
    public static void main(String[] args) {
        DataBaseConnection DBC =DataBaseConnection.getInstance();
        DataBaseConnection DBC2 =DataBaseConnection.getInstance();
        DataBaseConnection DBC3 =DataBaseConnection.getInstance();
    }
}
