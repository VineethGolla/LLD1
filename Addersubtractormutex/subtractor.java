package Addersubtractormutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class subtractor implements Callable<Void> {
    private final Lock lock;
    public count count;
    public subtractor(count count, Lock lock){
        this.count=count;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100; i++){
//            synchronized(count){
            lock.lock();
            count.value-=i;
            lock.unlock();
//            }
        }
        return null;
    }
}
