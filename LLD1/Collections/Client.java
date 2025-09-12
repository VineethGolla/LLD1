package LLD1.Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {

//        //    *List, Queue,Set are the most imp Collection frameworks
//        //    List - ArrayList, LinkedList, Stack, Vector
//        //    Set - hashSet, LinkedHashSet, EnumSet, TreeSet
//        //    Queue - Deque, PriorityQueue
//
//        List<String> ls1 = new ArrayList<>();
//        ls1.add("Vin");
//        ls1.add("Vin2");
//        List<String> ls2 = new LinkedList<>();
//
//        //Vector-Threadsafe, use it in multithreaded env
//        List<String> ls3 = new Vector<>();
//
//
//
// Just an extension of vector which supports LIFO
//        //push, pop, peek, size --these methods, thread safe
//        List<String> ls4 = new Stack<>();
//
//
//
//        /* Set LLD1.Interface
//        -Not Threadsafe
//        -No duplicate elements
//        -constant time operations for search and insert - almost o(1)
//        -No order
//         */
//
//        //No order
//        Set<String> s1 = new HashSet<>();
//        s1.add("vin");
//        s1.add("bin");
//        s1.add("din");
//        s1.add("cin");
//        s1.add("ain");
//        s1.add("ain");
//        System.out.println(s1);
//
//        //Alphabet order
//        Set<String> s2= new TreeSet<>();
//        s2.add("vin");
//        s2.add("bin");
//        s2.add("din");
//        s2.add("cin");
//        s2.add("ain");
//        System.out.println(s2);
//
//        //Exact order
//        Set<String> s3= new LinkedHashSet<>();
//        s3.add("vin");
//        s3.add("bin");
//        s3.add("din");
//        s3.add("cin");
//        s3.add("ain");
//        System.out.println(s3);
//
//        //EnumSet
//        Payment p1 = new Payment();
//        p1.Pay = PaymentStatus.SUCCESSFUL;
//        Payment p2 = new Payment();
//        p2.Pay = PaymentStatus.DECLINED;
//        //Accepts A list of ENUMS and creates a set of ENUMS
//        System.out.println(p1.Pay);
//        Set<PaymentStatus> s4=EnumSet.allOf(PaymentStatus.class);
//        System.out.println(s4);


        //QUEUE INTERFACE
        //PRIORITY Queues
        //Alphabetical order
//        Queue<String> q = new PriorityQueue<>();
//        q.add("vin");
//        q.add("bin");
//        q.add("din");
//        q.add("cin");
//        q.add("ain");
////        q.add("ain");
//
//        while(!q.isEmpty()) {
////            System.out.println(q.poll()); //prints the pop element
//            System.out.print(q.peek()+" "); //front
//            q.poll(); //pop
//        }

//        Queue<String> q= new PriorityQueue<>(new LLD1.Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                int cmp = o1.compareTo(o2);
//                if(cmp >=1) {
//                    return 1;
//                }else if(cmp <= -1) {
//                    return -1;
//                }else return 0;
//            }
//        });
//            q.add("vin");
//            q.add("bin");
//            q.add("din");
//            q.add("cin");
//            q.add("ain");
//            while(!q.isEmpty()) {
//                System.out.println(q.poll());
////                q.poll();
//            }
        List<Studentqueues> ls = new ArrayList<>();
        Studentqueues s1=new Studentqueues(1,"Vin",90);
        Studentqueues s2=new Studentqueues(2,"Pin",91);
        Studentqueues s3=new Studentqueues(3,"Sip",89);
        ls.add(s1);
        ls.add(s2);
        ls.add(s3);
        Collections.sort(ls);
        for(Studentqueues s : ls) {
            System.out.println(s.psp);
        }

//        LLD1.Collections.sort(ls, new StudentComparator());
//        for(Studentqueues s : ls) {
//            System.out.println(s.name);
//        }
    }

}
