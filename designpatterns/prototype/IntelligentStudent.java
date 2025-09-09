package designpatterns.prototype;

public class IntelligentStudent extends Student {
    public int iq;
    public IntelligentStudent(IntelligentStudent student) {
        super(student);
        this.iq=student.iq;
    }

    IntelligentStudent() {

    }

    @Override
    public Student clone(){
//        return super.clone();
        return new IntelligentStudent(this);
    }
}