package designpatterns.ObserverDesign;

public class Client {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer Phoneapp=new Phoneapp("iphone");
        Observer TV=new TV("International report");

        station.registerObserver(Phoneapp);
        station.registerObserver(TV);

        station.setweather(29.9F,5.0F);

        station.removeObserver(Phoneapp);

        System.out.println();
    }
}
