package LLD1.Interface;

public class example1 {
    public static void main(String[] args) {
        animal a=new dog();
        a.walk();
        a.eat();

        a.walk("okie");
        a.eat("dokie");
        a.sleep("donee");
    }
}

interface animal{
    void walk();
    void eat();
    void sleep();

    void walk(String s);
    void eat(String k);
    void sleep(String l);

}

class dog implements animal{

    public String s;
    public String k;
    public String l;
    public void walk(){
        System.out.println("walk dun dun");
    }
    public void eat(){
        System.out.println("eat ey eyy");
    }
    public void sleep(){
        System.out.println("sleep slin slin");
    }

    public void walk(String c){
        System.out.println(c);
    }
    public void eat(String cc){
        System.out.println(cc);
    }
    public void sleep(String ccc){
        System.out.println(ccc);
    }
}
