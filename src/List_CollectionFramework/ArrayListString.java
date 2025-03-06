package List_CollectionFramework;

import java.util.ArrayList;

public class ArrayListString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Carrot");
        list.add("Papaya");
        for (String x : list){
            System.out.println(x);
        }

        System.out.println(list);
    }
}
