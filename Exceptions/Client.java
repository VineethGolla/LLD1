package Exceptions;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        int x=s.findStudentByRollno(1);
        /*
        If I want to print a message on my website instead of errors, the ebst way is try and catch
        try, catch --> if, else if  but we can print along with message if exception occurs
         */
//        try{
//            s.findStudentByRollno(31);
//        }
//        catch (ClassNotFoundException ex1){
//            System.out.println("Class not found exception has come");
//        }
//        catch (EvenNumberException ex2){
//            System.out.println("Even number exception has come");
//        }
//        catch (OddNumberException ex3){
//            System.out.println(ex3.getMessage());
//        }
    }
}
