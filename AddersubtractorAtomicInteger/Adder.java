//package AddersubtractorAtomicInteger;
//
//import java.util.concurrent.Callable;
//import java.util.concurrent.atomic.AtomicInteger;
//
//public class Adder implements Callable<Void> {
//    private AtomicInteger value;
//    private count count; //Hey class, please create a private variable named count that can hold a reference to a count object, so I can use it inside this class.
//    public Adder(count count){
//
//        this.count=count;
//    }
//
//    @Override
//    public Void call() throws Exception {
//        for(int i=1; i<=100;i++){
//            count.value.addAndGet(i);
//        }
//        return null;
//    }
//}
