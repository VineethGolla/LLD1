package LLD1.polymorphism;

public class example1 {
    public static void main(String[] args) {
        client s=new client("michael");
        System.out.print(s.name);
        s.output();
    }
}

class client{
    String name;
    void output(){

        System.out.print("hello" +" ");
    }
    public client(String s){
        this.name=s;
//        System.out.print(this.name);
    }

}
