package Addersubtractormutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Lock lock;
    private count count; //Hey class, please create a private variable named count that can hold a reference to a count object, so I can use it inside this class.
    public Adder(count count, Lock lock){
        this.count=count;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100;i++){
//            synchronized (count){
            lock.lock();
                count.value+=i;
                lock.unlock();
//            }
        }
        return null;
    }
}
