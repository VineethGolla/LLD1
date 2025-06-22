package Addersubtractorsyncmethod;

public class count {
    public int value;
    count(int value){

        this.value=value;
    }
    public synchronized void addition(int x){

        value += x;
    }
    public synchronized void subtract(int x){

        value -= x;
    }
//    count(){
//
//        value=0;
//    }
}
