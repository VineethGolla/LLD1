package LLD1.Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Collections;

public class Integersort {

    public static List<Integer> sort(List<Integer> values) {
        Comparator<Integer> com = new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10){
                    return 1; //If you need change. if value 1>value 2 then i need to swap.
                }else {
                    return -1;
                }
            }
        };
        List<Integer> nums = new ArrayList<>(values);
        Collections.sort(nums ,com);//need to use if i need my own sorting, otherwise collections(nums) is enough
        System.out.println(nums);
        return nums;
    }
}
