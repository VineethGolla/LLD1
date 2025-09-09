package designpatterns.prototype;

public class Student implements Prototype <Student>{
    private String name;
    private int age;
    private double psp;
    private String Batchname;
    private double averagePsp;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public double getPsp() {
        return psp;
    }

    public String getBatchname() {
        return Batchname;
    }

    public double getAveragePsp() {
        return averagePsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchname(String batchname) {
        Batchname = batchname;
    }

    public void setAveragePsp(double averagePsp) {
        this.averagePsp = averagePsp;
    }

    public Student(Student student) {
        this.name = student.getName();
        this.age = student.getAge();
        this.psp = student.getPsp();
        this.Batchname = student.getBatchname();
        this.averagePsp = student.getAveragePsp();

//        this.name = student.name();
//        this.age = student.age();
//        this.psp = student.psp();
//        this.Batchname = student.Batchname();
//        this.averagePsp = student.averagePsp();
    }
    public Student() {

    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
