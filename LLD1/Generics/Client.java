package LLD1.Generics;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Pair<String, String> p1=new Pair<>("1","Vin");
        System.out.println(p1.getsecond());
//        Pair<String, Double> p2=new Pair<>("Vin",1.0);
//        System.out.println(p2.getFirst());


//        p1.setFirst(100);
//        System.out.println(p1.getFirst());
//
//        p2.setFirst("Vinny");
//        System.out.println(p2.getFirst());
        p1.setirst("Vinny");
//        System.out.println(p2.getirst());
//
//        p2=new Pair<>("jinny",2.0);
//        System.out.println(p2.getFirst());


//old
//        Oldpair o1=new Oldpair("Sing",6.0);
//        System.out.println(o1.first);
//        o1.first="Ding";
//        System.out.println(o1.first);
//        o1.first=5;
//        System.out.println(o1.first);
//        System.out.println(o1.second);
//
//        Pair.dosomething("sigh");
/**/

        //p1.doagain(1,2);
//        Integer as=p1.doagain(1111,2222);
//        System.out.print(as);

//        String as=p1.doagain1(2,"SRK");
//        System.out.print(as);

        //Animal concept
//    List<Animal> animals = new ArrayList<Animal>();
//    Animal A1 = new Animal();
//    A1.name = "zury";
//    Animal A2 = new Animal();
//    A2.name = "Fury";
//    animals.add(A1);
//    animals.add(A2);
//    Application.dosomething(animals);

    List<Dog> dogs=new ArrayList<>();
    Dog A3 = new Dog();
    A3.name = "HURY";
    Dog A4 = new Dog();
    A4.name = "JARY";
    dogs.add(A3);
    dogs.add(A4);
    Application.dogsdosomething(dogs);

    dogs.add(new Dog());
    dogs.add(new Dog());
    Application.dogsdosomething(dogs);



    }
}
