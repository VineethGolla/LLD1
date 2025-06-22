package producerconsumer;

import java.util.Queue;

public class consumer implements Runnable{
    private int maxsize;
    private Queue<Object> store;
    private String name;

    public consumer(int maxsize, String name, Queue<Object> store){
        this.maxsize = maxsize;
        this.name=name;
        this.store=store;
    }

    @Override
    public void run() {
        while(true) {
            if (this.store.size() > 0) {
                store.remove();
            }
        }
    }
}
