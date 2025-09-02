package Singleton;

//creational , structural and functional design patterns

//Creational - Singleton, Builder

public class DataBaseConnection {
    String url;
    String username;
    String password;
    Long port;
    private static DataBaseConnection instance=null;
    private DataBaseConnection(){

    }
    public static DataBaseConnection getInstance(){
        if (instance == null){
            synchronized (DataBaseConnection.class){
                if (instance == null){
                    instance = new DataBaseConnection();
                }
            }
        }
        System.out.println("debug");
        return instance;
    }
}
