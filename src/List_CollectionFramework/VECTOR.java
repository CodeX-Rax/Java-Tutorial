package List_CollectionFramework;

import java.util.Arrays;
import java.util.Vector;

public class VECTOR {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>(10,2);
        System.out.println(vector.capacity());//Unlike ArrayList Vector has separate method to check initial Capacity
        vector.add(32343);
        vector.add(765);
        vector.add(7651);
        vector.sort(null);
        System.out.println(vector);
        Vector<String> string= new Vector<>(Arrays.asList("R","U","S","H","A","B","H"));
        System.out.println(string);


    }
}
