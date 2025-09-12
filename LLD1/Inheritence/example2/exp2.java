package LLD1.Inheritence.example2;

public class exp2 {
    public static void main(String[] args) {
        Instructor  i= new Instructor("vinny", 2, "Scaler");
    }
}
 class user{
    String name;
    int age;

    public user(String name, int age){
        this.name=name;
        this.age=age;
        System.out.print(this.name + this.age);

    }
    public user(){

    }
//    System.out.print(this.name + this.age);
 }

 class Instructor extends user{
    String course;

    public Instructor(String name, int age, String course){
        super(name, age);
        this.course=course;
    }
//    System.out.print(this.name + this.age + this.course);
 }