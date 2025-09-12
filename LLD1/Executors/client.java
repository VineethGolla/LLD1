package LLD1.Executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class client {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newFixedThreadPool(10);
//        ExecutorService ex= LLD1.Executors.newCachedThreadPool();

        for(int i=1;i<=100;i++){

            Printnumber p = new Printnumber(i);
            ex.submit(p);
//            if(i==50000){
//                System.out.println("Debug point");
//            }
        }
        ex.shutdown();
    }
}
