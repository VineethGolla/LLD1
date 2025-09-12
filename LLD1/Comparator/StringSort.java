package LLD1.Comparator;

import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class StringSort {
    public int age;
    public String name;
    public StringSort(int age,String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
    public static List<StringSort> sortbyage(List<StringSort> ages){
        Comparator<StringSort> com = new Comparator<StringSort>() {
            public int compare(StringSort o1, StringSort o2) {
                if(o1.age > o2.age){
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(ages,com);
        return ages;
    }
}
