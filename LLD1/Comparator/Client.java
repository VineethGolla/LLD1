package LLD1.Comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements");
//        int n = sc.nextInt();
//        List<Integer> num = new ArrayList<Integer>();
//        for(int i=0;i<n;i++){
//            num.add(sc.nextInt());
//        }
//        sc.close();
//        List<Integer> Integersorted = Integersort.sort(num);
////        for(Integer v:Integersorted){
////            System.out.println(v);
////        }
//        System.out.println(Integersorted);



        /*String sorting based on age by own */
        Scanner scn= new Scanner(System.in);
        System.out.println("Enter the number of strings to get sorted");
        int n1=scn.nextInt();
        List<StringSort> str= new ArrayList<>(n1);
        for(int i=0;i<n1;i++) {
            System.out.println("Age1: ");
            int age1 = scn.nextInt();
            System.out.println("name1: ");
            String name = scn.next();
            StringSort s = new StringSort(age1, name);
            str.add(s);
        }
        scn.close();
        List<StringSort> ans=StringSort.sortbyage(str);
        for(StringSort St :ans){
            System.out.println(St.age +" "+ St.name);
        }
    }
}
