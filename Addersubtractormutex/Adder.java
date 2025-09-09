package Addersubtractormutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Lock lock;
    private count val; //Hey class, please create a private variable named count that can hold a reference to a count object, so I can use it inside this class.
    public Adder(count val, Lock lock){
        this.val=val;
        this.lock=lock;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100;i++){
//            synchronized (count){
            lock.lock();
            val.value+=i;
            lock.unlock();
//            }
        }
        return null;
    }
}
