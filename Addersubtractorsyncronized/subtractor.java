package Addersubtractorsyncronized;

import java.util.concurrent.Callable;

public class subtractor implements Callable<Void> {
    public count count;
    public subtractor(count count){

        this.count=count;
    }

    @Override
    public Void call() throws Exception {
        for(int i=1; i<=100; i++){
            synchronized(count){
                count.value-=i;
            }
        }
        return null;
    }
}
