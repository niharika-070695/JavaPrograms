import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableVsComparator {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(2);
        nums.add(7);
        nums.add(1);
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println("After sorting: "+ nums);
        List<Integer> nums1 = new ArrayList<>();
        nums1.add(43);
        nums1.add(31);
        nums1.add(72);
        nums1.add(29);
        //when you want to sort numbers based on last digit of number
        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(nums1,com);
        System.out.println("After sorting based on last digit of number: " + nums1);
        //when you want to sort strings based on length of the string
        List<String> s1 = new ArrayList<>();
        s1.add("Niharika");
        s1.add("Lavanya");
        s1.add("Manisha");
        s1.add("Sam");
        s1.add("Pavan");
        Comparator<String> coms = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()>o2.length())
                    return 1;
                else
                    return -1;
            }
        };
        Collections.sort(s1,coms);
        System.out.println("After sorting based on length of string: "+ s1);

    }
}
