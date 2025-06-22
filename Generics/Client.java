package Generics;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, String> p1=new Pair<>(1,"Vin");
        System.out.println(p1.getFirst());
        Pair<String, Double> p2=new Pair<>("Vin",1.0);
        System.out.println(p2.getFirst());


//        p1.setFirst(100);
//        System.out.println(p1.getFirst());
//
//        p2.setFirst("Vinny");
//        System.out.println(p2.getFirst());
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

        String as=p1.doagain1(2,"SRK",2.5);
        System.out.print(as);


    }
}
