package producerconsumer;

import java.util.Queue;

public class producer implements Runnable{
    private int maxsize;
    private Queue<Object> store;
    private String name;

    public producer(int maxSize, String name, Queue<Object> store){
        this.maxsize = maxsize;
        this.name=name;
        this.store=store;
    }
    @Override
    public void run() {
        while(true) {
            if (this.store.size() < maxsize) {
                store.add(new Object());
            }
        }

    }
}
