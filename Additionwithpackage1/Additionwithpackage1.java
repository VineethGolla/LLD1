package Additionwithpackage1;

import java.util.concurrent.Callable;

public class Additionwithpackage1 implements Callable<Integer> {
    int a;
    int b;
    public Additionwithpackage1(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public Integer call() throws Exception {
        System.out.println(Thread.currentThread().getName());
        return a+b;
    }
}
