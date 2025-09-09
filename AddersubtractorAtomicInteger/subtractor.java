//package AddersubtractorAtomicInteger;
//
//import java.util.concurrent.Callable;
//
//public class subtractor implements Callable<Void> {
//    public count count;
//    public subtractor(count count){
//
//        this.count=count;
//    }
//
//    @Override
//    public Void call() throws Exception {
//        for(int i=1; i<=100; i++){
//            count.value.addAndGet(-i);
//        }
//        return null;
//    }
//}
