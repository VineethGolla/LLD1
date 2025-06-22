package producerconsumer;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedDeque;

public class client {
    public static void main(String[] args) {
        Queue<Object> store=new ConcurrentLinkedDeque<>();
        producer p1=new producer(6,"p1",store);
        producer p2=new producer(6,"p2",store);
        producer p3=new producer(6,"p3",store);

        consumer c1=new consumer(6,"c1",store);
        consumer c2=new consumer(6,"c2",store);
        consumer c3=new consumer(6,"c3",store);
        consumer c4=new consumer(6,"c4",store);
        consumer c5=new consumer(6,"c5",store);

        Thread t1=new Thread(p1);
        Thread t2=new Thread(p2);
        Thread t3=new Thread(p3);
        Thread t4=new Thread(c1);
        Thread t5=new Thread(c2);
        Thread t6=new Thread(c3);
        Thread t7=new Thread(c4);
        Thread t8=new Thread(c5);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
    }
}
