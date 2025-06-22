package Demo;

public class main {
    public static void main(String[] args) {
//        student name = new student();
//        name.name = "Vinny";
//        name.age = 18;
//        name.changebatch();
//
//        student name2 = new student();
//        name2.name = "okiedokie";
//        name2.age = 19;
//        name2.changebatch();
//        student s=new student(27, "jil");
//        System.out.println(s.name);
//        test(s);
        student s=new student();
//        public String name;
//        public int age;
        s.name="John";
        s.age=18;
        test(s);
        test1("okie");
        student copy = new student(s);
        System.out.println(copy.name);
        System.out.println(copy.age);
        System.out.print(s.age); //for overriding values of an object, just create a function and pass these object, if we override anything in func, it overrides the behaviour of this object as well.
    }
    public static void test(student k){
        System.out.println(k.name);
        System.out.println(k.age);
        k.age=10;
        System.out.println(k.age);
        k.name="comeon";
        k.age=100;
    }
    public static void test1(String name){

        System.out.println(name);
//        s.name=10;

    }
}
