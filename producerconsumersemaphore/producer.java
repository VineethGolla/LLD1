package producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class producer implements Runnable{
    private int maxsize;
    private final Queue<Object> store;
    private Semaphore P;
    private Semaphore C;
    private String name;

    public producer(int maxSize, String name, Queue<Object> store, Semaphore P, Semaphore C){
        this.store=store;
        this.P=P;
        this.C=C;
        this.name=name;
    }
    @Override
    public void run() {
        while(true) {
            try {
                P.acquire();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            if (this.store.size() < maxsize) {
//                store.add(new Object());
//                System.out.println(this.name+"adding"+this.store.size());
//            }
            store.add(new Object());
            System.out.println(this.name+"adding"+this.store.size());
            C.release();
        }

    }
}
