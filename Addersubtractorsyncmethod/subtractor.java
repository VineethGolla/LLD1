package Addersubtractorsyncmethod;

import java.util.concurrent.Callable;

public class subtractor implements Callable<Void> {
    public final Addersubtractorsyncmethod.count count;
    public subtractor(Addersubtractorsyncmethod.count count){
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
