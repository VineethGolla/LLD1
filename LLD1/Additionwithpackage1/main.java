package LLD1.Additionwithpackage1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> x=new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            Additionwithpackage1 add=new Additionwithpackage1(i, i+1);
            Future<Integer> y=executor.submit(add);
            x.add(y);
        }
//        x.get();
        for(int i=0;i<100;i++){
            System.out.println(x.get(i).get());
//            System.out.println(x.get(i));
        }
    }
}

