package Generics;

import java.util.List;

public class Application {
    Animal animal;
//    public static void dosomething(List<Animal> animals){
//        for(Animal a : animals){
//            System.out.println(a.name);
//        }
//    }
//    public static void dogsdosomething(List<? extends Animal> animals ){
//        for(Animal d : animals){
//            System.out.println(d.name);
//        }
//    }

    public static <T extends Animal> T dogsdosomething(List<T> animals ){
        for(Animal d : animals){
            System.out.println(d.name);
        }
        return animals.get(0);
    }
}
