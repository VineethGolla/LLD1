package LLD1.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class consumer implements Runnable{
    private int maxsize;
    private final Queue<Object> store;
    private final String name;
    private Semaphore P;
    private Semaphore C;

    public consumer(int maxsize, String name, Queue<Object> store, Semaphore P,Semaphore C){
        this.maxsize = maxsize;
        this.name=name;
        this.store=store;
        this.P=P;
        this.C=C;
//        this.P=new Semaphore(6);
//        this.C=new Semaphore(0);
    }

    @Override
    public void run() {
        while(true) {
            try {
                C.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if (this.store.size() > 0) {
                store.remove();
                System.out.println(this.name+"removing"+this.store.size());
//            }
            P.release();
        }
    }
}
