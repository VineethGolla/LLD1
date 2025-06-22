//package producerconsumersemaphore;
//
//import java.util.Queue;
//import java.util.concurrent.ConcurrentLinkedDeque;
//import java.util.concurrent.Semaphore;
//
//public class client {
//    public static void main(String[] args) {
//        Queue<Object> store=new ConcurrentLinkedDeque<>();
////        Semaphore P=new Semaphore(6);
////        Semaphore C=new Semaphore(0);
////        Semaphore
//        producer p1=new producer(6,"p1",store,P,C);
//        producer p2=new producer(6,"p2",store,P,C);
//        producer p3=new producer(6,"p3",store,P,C);
//
//        consumer c1=new consumer(6,"c1",store,P,C);
//        consumer c2=new consumer(6,"c2",store,P,C);
//        consumer c3=new consumer(6,"c3",store,P,C);
//        consumer c4=new consumer(6,"c4",store,P,C);
//        consumer c5=new consumer(6,"c5",store,P,C);
//
//        Thread t1=new Thread(p1);
//        Thread t2=new Thread(p2);
//        Thread t3=new Thread(p3);
//        Thread t4=new Thread(c1);
//        Thread t5=new Thread(c2);
//        Thread t6=new Thread(c3);
//        Thread t7=new Thread(c4);
//        Thread t8=new Thread(c5);
//
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
//        t5.start();
//        t6.start();
//        t7.start();
//        t8.start();
//    }
//}
//
////Producer calls P.acquire() →
////
////If P > 0 (empty slots available), it decrements P by 1 and proceeds.
////
////Else it waits until a consumer calls P.release().
////
////Producer adds 1 item to store.
////
////Producer calls C.release() →
////
////Increments C by 1 (item available to consume).
////
////Consumer calls C.acquire() →
////
////If C > 0 (items available), it decrements C by 1 and proceeds.
////
////Else it waits until a producer calls C.release().
////
////Consumer removes 1 item from store.
////
////Consumer calls P.release() →
////
////Increments P by 1 (slot freed).
