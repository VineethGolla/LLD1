package LLD1.polymorphism;

public class example2 {
    public static void main(String[] args) {
        A obj = new C();
        obj.print();
        obj=new B();
        obj.print();
        obj=new C();
        obj.print("chai");
    }
}

class AA{
    public String s;
    void print(){
        System.out.println("A");
    }
    void print(String s){
        System.out.println(s);
    }
}
class BB extends AA{
    void print(){
        System.out.println("B");
    }
}

class CC extends BB{
    void print(){
        System.out.println("C");
    }
    void print(String s){
        System.out.println(s);
        System.out.println(s + " addict");

    }
}
