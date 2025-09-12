package LLD1.polymorphism;

public class ex3super {
    public static void main(String[] args) {
        A obj = new C();
        //A must have the print(), at compile time obj looks for A's print(), then since C's heap stores obj it get overridden at c. If c has no print(), then A's print() wil be printed
        obj.print();
        obj=new B();
        obj.print();
        obj=new C();
        obj.print("chai");
        C print1=new C(25 , " Do it consistently");
    }
}

class A{
    public String s;
    public int b;
    void print(){
        System.out.println("A");
    }
    void print(String s){
        System.out.println(s);
    }
//    A(int b){
//        this.b=b;
//    }
}
class B extends A{
    int s;
    public int b;
    void print(){
        super.print(); //It also calls parent irrespective of overriding methods
        System.out.println("B");
    }
    B(int s){
        s=50;
        this.s=s;
        System.out.println(this.s);
    }
//    B(int b){
//        super(b);
//        b=50;
//        this.b=b;
//    }
    B(){
//        super(b);
    }
}

class C extends B{
    String k;
    void print(){
        super.print();
        System.out.println("C");
    }
    void print(String s){
//        int b;
//        String k;
//        super.print(s + " addict 1"); //to call any parent method
        System.out.println(s);
        System.out.println(s + " addict 2");

    }
    //default constructor since I have added a new constructor just above
    C(int b,String k){ //Here since this is an extended class, it just thinks as B(..) and then A(..). That's why super also works
//        super(b);
        k=" king";//Takes int b value from B and K from here
        this.k=k;
        System.out.println(b+this.k);
    }
//    C(){
//
//    }
    C(){
//        super.print();
    }
}


////if there is no parent method, then no need to use super(), it just considers default///