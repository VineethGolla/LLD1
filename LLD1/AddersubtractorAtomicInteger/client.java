//package LLD1.AddersubtractorAtomicInteger;
//
//import java.util.concurrent.ExecutionException;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.LLD1.Executors;
//import java.util.concurrent.Future;
//
//public class client {
//    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        count Count=new count(); //Count (stack variable) holds the address of the count object, which is stored in heap with value = 0
//        Adder adder = new Adder(Count); //passing address of 0 (variable above)/created adder object and count address is passed. just to modify count, adder is created as shared bank account(count)
//        subtractor Subtractor = new subtractor(Count);
//
//        ExecutorService ex= LLD1.Executors.newCachedThreadPool();
//        Future<Void> add=ex.submit(adder);
//        Future<Void> sub=ex.submit(Subtractor);
//        add.get();
//        sub.get();
//        System.out.println(Count.value);
//    }
//}
