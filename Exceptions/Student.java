package Exceptions;

public class Student {
//    public void findStudentByRollno(int rollNo) throws ClassNotFoundException,EvenNumberException, OddNumberException{
        public int findStudentByRollno(int rollNo){
//        if(rollNo<30){
//            throw new ClassNotFoundException();
//        }
//        else if(rollNo % 2==0){
//            throw new EvenNumberException();
//        }else if(rollNo % 2 !=0 ){
//            OddNumberException o = new OddNumberException("OddNumberException dear");
//            throw o;
//        }

//        return 1/1;
        try{
            if(rollNo<30 && rollNo>10){
                throw new ClassNotFoundException();
            }
            else if(rollNo % 2==0 && rollNo>10){
                throw new EvenNumberException();
            }else if(rollNo % 2 !=0 && rollNo>10 ){
                OddNumberException o = new OddNumberException("OddNumberException dear");
                throw o;
            }
        }
        catch (ClassNotFoundException ex1){
            System.out.println("Class not found exception has come");
        }
        catch (EvenNumberException ex2){
            System.out.println("Even number exception has come");
        }
        catch (OddNumberException ex3){
            System.out.println(ex3.getMessage());
        } finally {
            System.out.println("I am in finally dear, bye"); //It must be executed whether the code is completed or pending
        }
        return 1;

    }
}
