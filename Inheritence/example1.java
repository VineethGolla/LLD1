package Inheritence;

public class example1 {
    public static void main(String[] args) {
        C c=new C();
    }
}
class A{
    public A(){
        System.out.print("A");
    }
}

class B extends A{
    public B(){
        System.out.print("B");
    }
    public B(String s){
        System.out.print("B:" + s);
    }
}

class C extends B{
    public C(){
//        super("hello");
        System.out.print("C");
    }
}
//super we need to assume it's default. C is dependent on B and B is on A. It's like if I pass something in main class but the constructor isn't accepting in student class.
//We call the parent with an attribute from child class using super.

