package designpatterns.BuilderDesign;

public class Client {
    public static void main(String[] args) {
//        Builder builder = new Builder();

//        Builder builder = Student.getBuilder();
//        builder.setName("vinny");
//        builder.setBatch("oct-2022");
//        builder.setAge(27);
//        builder.setCompany("abc");
//        builder.setPsp(90.5);
//        Student s=builder.Build();

        Student student = Student.getBuilder()
                                 .setName("Vinny")
                                 .setBatch("oct-2022")
                                 .setAge(27)
                                 .setCompany("abc")
                                 .Build();


        System.out.println("DEBUG");
    }
}
