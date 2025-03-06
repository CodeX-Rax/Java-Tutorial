package List_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
public class SortingUsinfCollection {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();
        list.add(2345);
        list.add(2);
        list.add(445);
        list.sort(null); //or Collections.sort(list);
        System.out.println(list);
    }
}
