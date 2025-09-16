package designpatterns.ObserverDesign;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        WeatherStation station = new WeatherStation();

        Observer Phoneapp=new Phoneapp("iphone");
        Observer TV=new TV("International report");

        station.registerObserver(Phoneapp);
        station.registerObserver(TV);

        System.out.println("update the temperature value :");
        float temp=scn.nextFloat();

        System.out.println("update the pressure value :");
        float pressure=scn.nextFloat();

        station.setweather(temp,pressure);

        station.removeObserver(Phoneapp);

        System.out.println();
    }
}
