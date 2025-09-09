package LambdasStreams;


/*
Labmda () -> {}
Runnable
        Callable
        Comparable
        Comparator
        Some of the interfaces which requires only 1 method to be implemented

        Functional Interface - An interface with only 1 method demanded.
        Lambdas - Way to create objects of the classes which implements functional interfaces
 */

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {
    public static void main(String[] args) {
        List<Studentqueues> ss = new ArrayList<>();
        Studentqueues ss1=new Studentqueues(1,"Vin",90);
        Studentqueues ss2=new Studentqueues(2,"Pin",91);
        Studentqueues ss3=new Studentqueues(3,"Sip",89);
        ss.add(ss1);
        ss.add(ss2);
        ss.add(ss3);
        ss.forEach((ele) -> {
            System.out.println("Element is: " + ele.id);
        });
//        Collections.sort(ls);
//        for(Studentqueues s : ls) {
//            System.out.println(s.psp);
//        }

//        Collections.sort(ls, new StudentComparator());
//        for(Studentqueues s : ls) {
//            System.out.println(s.name);
//        }

//        Method - 1
//        Collections.sort(ls, new Comparator<Studentqueues>(){
//            @Override
//            public int compare(Studentqueues a, Studentqueues b){
//                if(a.psp > b.psp){
//                    return 1;
//                }else if(a.psp < b.psp){
//                    return -1;
//                }else return 0;
//            }
//        });
        //Comparable --> Used when sorting naturally. we use CompareTo inside override
        //Comparator --> Used if there is more than one sorting, Compare is used inside override

        //Method 2
        Collections.sort(ss, (Studentqueues a, Studentqueues b) -> {
            return a.name.compareTo(b.name);
        });
        for(Studentqueues student:ss){
            System.out.println(student.name);
        }

        //Helloworld

        Helloworld task1 = new Helloworld();
        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(() -> {
            System.out.println("Hello World");
        });
        thread2.start();

        /*
        I want to do some operations
        Addition
        subtraction
         */
//        Math addition = (int a ,int b) -> {
//           return a+b;
//        };
//        Math Subtraction = (int a, int b) -> {
//           return a-b;
//        };
//        Math random =(int a , int b) -> {
//            if(a>b){
//                return a-b;
//            }else return a+b;
//        };
//        int ans1=addition.operation(2,10);
//        int ans2=Subtraction.operation(2,10);
//        int ans3=random.operation(2,10);
//        System.out.println(ans1);
//        System.out.println(ans2);
//        System.out.println(ans3);




//--------------------------------------------------------------------------------------



        /*Streams
        Like a pipeline
        Enters and leaves without holding
        Stream doesn't affect the actual data
        Mainly used for testing/RA
         */

        List<Integer> ls= List.of(5,4,3,2,8,9);
        Stream<Integer> s1 = ls.stream();
        Stream<Integer> s2 = ls.stream().limit(3);
        System.out.println(s1);
        System.out.println(ls.stream().limit(4));
        //Intermediate methods - s1 and Limit are stream reference and both gives only reference
        //Terminal methods - count, For each gives the values
        System.out.println(s1.limit(5).count());
//        System.out.println(s1.limit(5).count()); //Fails because stream is already operating on s1
        s2.forEach((ele) -> {
            System.out.println("elements are :" + ele);
        });
        //  System.out.println(s2.limit(5).count()); //Fails

        //filter
        List<Integer> ls2 = ls
                .stream()
                .filter((ele) -> ele % 2==0)
                .limit(8)
                .collect(Collectors.toList());
        System.out.println(ls2);


        //Map
        List<Integer> ls3 = ls
                .stream()
                .filter((ele) -> ele %2 ==0)
                .map((ele) -> ele * ele)
                .sorted((x , y) -> { return x-y; })
                .collect(Collectors.toList());
        System.out.println(ls3);



        //findFirst()
        Optional<Integer> ls4 = ls
                .stream()
                .filter((ele) -> ele %2 ==0)
                .map((ele) -> ele * ele)
                .sorted((x , y) -> { return x-y; })
                .findFirst();
        if(ls4.isPresent()){
            System.out.println(ls4.get());
        }


        //reduce
        Integer ls5 =ls.stream().filter((ele) -> ele % 2==0).map((ele) ->ele * ele).sorted((x,y) -> {return x-y;}).reduce(0,(a,b) -> {return a+b;});
        System.out.println(ls5);
//It's like doing
        int ans=0;
        for(int i=0;i<ls3.size();i++){
            ans += ls3.get(i);
        }
        System.out.println(ans);

        //Now I wanna find the min element among them
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ls3.size();i++){
            if(ls3.get(i)<min){
                min=ls3.get(i);
            }
        }
        System.out.println(min);

        Integer ls6 =ls
                .stream()
                .filter((ele) -> ele % 2 ==0)
                .map((ele) -> ele * ele)
                .sorted((x,y) -> {return x-y;})
                .reduce(Integer.MAX_VALUE,(a,b) -> {
                    return Math.min(a,b);
                });
        System.out.println(ls6);

    }

}
