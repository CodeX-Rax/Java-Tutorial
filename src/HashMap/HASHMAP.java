package HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HASHMAP {
    public static void main(String[] args) {
        //Map doesnot expends collection interface
        HashMap<Integer,String> map=new HashMap<>();//complexity o(1)
        map.put(101,"rushabh");
        map.put(102,"charvi");
        map.put(103,"sanskruti");
        map.put(104,"shreyash");
        System.out.println(map);
        System.out.println(map.get(103));
        System.out.println(map.containsKey(104));
        System.out.println(map.containsValue("charvi"));

        //loop in Hashmap
        for (int i : map.keySet()){
            System.out.println(map.get(i));
        }
        //loop
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> i: entries){
            System.out.println(i.getKey() + " : " + i.getValue());
        }

    }
}
