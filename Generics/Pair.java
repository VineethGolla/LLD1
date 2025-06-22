package Generics;

public class Pair<V, S> {
    V first;
    S second;

    Pair(V first, S second){
        this.first=first;
        this.second=second;
    }

    //if we want to set/change thr value then use set method and to get that back use get
    public void setFirst(V first){
        this.first=first;
    }
    public V getFirst(){
        return this.first;
    }
//    public S getsecond(){
//        return this.second;
//    }

    public static <T> void dosomething(T data){
        System.out.println(data);
    }

//    public <Z,Y> Z doagain(Z val, Y val2){
////        return val2;
//        System.out.println(val2);
//        return val;
//    }
    public <Z,Y> Y doagain1(V data, Y val, Z val2){
        return val;
    }
}
