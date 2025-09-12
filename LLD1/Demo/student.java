package LLD1.Demo;

public class student {
    String name;
    int age;
    void changebatch(){
        System.out.println(this.name + "is done");
    }
    public student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    public student() {
        this.name = "jiljil";
        this.age = 15;
    }
    public student(student s){
        this.name=s.name;
        this.age=s.age;
    }
//    public student(String k){
//        this.name=k.name;
////        this.age=s.age;
//    }
}
