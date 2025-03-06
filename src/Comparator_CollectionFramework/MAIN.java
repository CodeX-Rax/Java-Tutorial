package Comparator_CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class StringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length()-o2.length();
    }
}
// o1 o2
//"ok" "bye"
class MyComparator implements Comparator<Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2 - o1;//this change the order of sorting
    }
}
public class MAIN {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(454);
        list.add(5432);
        list.sort(new MyComparator());
        System.out.println(list);

        List<String> word=Arrays.asList("Banana","apple","Date");
        word.sort(new StringComparator());
        System.out.println(word);

    }
}
