package List_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listt {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        System.out.println(list.getClass().getName());//class name milega
        System.out.println();

        List<String> list1= Arrays.asList("Monday","Tuesday","Thursday");
        list1.set(2,"Wednesday");
        System.out.println(list1);

        List<Integer> list2=Arrays.asList(1,2,3,4,5,6,7,8,9);
        System.out.println(list2);

        List<Integer> list3=new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println(list3);
        list3.remove(Integer.valueOf(1));
        System.out.println(list3);

    }
}
