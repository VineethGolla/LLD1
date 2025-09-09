package designpatterns.prototype;

import Demo.student;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillregistry(studentRegistry);

        Student vinny=studentRegistry.get("job2026").clone();
        vinny.setName("Vinny");
        vinny.setPsp(70.0);

        Student vinny2=studentRegistry.get("job2026").clone();
        vinny2.setName("Vinny2");
        vinny2.setPsp(70.0);


    }

    public static void fillregistry(StudentRegistry studentRegistry) {
        Student fulltime = new Student();
        fulltime.setBatchname("job2026");
        fulltime.setAveragePsp(70.0);
        studentRegistry.register("job2026", fulltime);

        Student internship = new Student();
        internship.setBatchname("internship2026");
        internship.setAveragePsp(70.0);
        studentRegistry.register("internship2026", internship);

        IntelligentStudent fulltimemust = new IntelligentStudent();
        fulltimemust.setBatchname("job2026must");
        fulltimemust.setAveragePsp(70.0);
        fulltimemust.iq=100;
        studentRegistry.register("job2026must", fulltimemust);


        System.out.println("DEBUG");
    }
}
