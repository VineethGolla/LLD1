package Executors;

public class Printnumber implements Runnable{
    int print;
    Printnumber(int x) {
        this.print = x;
    }
        @Override
        public void run() {
            System.out.println(this.print);
        }
//        System.out.print(noToPrint);
}
