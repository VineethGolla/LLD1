package Addersubtractorsyncmethod;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        count Count=new count(0); //Count (stack variable) holds the address of the count object, which is stored in heap with value = 0
        Adder adder = new Adder(Count); //passing address of 0 (variable above)
        subtractor Subtractor = new subtractor(Count);

        ExecutorService ex= Executors.newCachedThreadPool();
        Future<Void> add=ex.submit(adder);
        Future<Void> sub=ex.submit(Subtractor);
        add.get();
        sub.get();
        System.out.println(Count.value);
    }
}
