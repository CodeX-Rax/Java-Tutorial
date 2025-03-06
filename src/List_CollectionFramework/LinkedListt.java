package List_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListt {
    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add(2);//1
        list.add(5);//2
        list.add(53);//3
        list.add(43);//4
        list.add(22);//5
        list.add(244);//6
        list.add(6543);//7
        list.addLast(99);//8 complexity O(1)
        list.addFirst(0);//0  complexity O(1)

        System.out.println("Integer LinkedList : "+list);//to get Element by index

        LinkedList<String> animals =new LinkedList<>(Arrays.asList("Cat","Dog" ,"Lion","Tiger","Elephant"));
        animals.removeAll(animals);
        System.out.println("Animal LinkedList : "+animals);
    }
}
