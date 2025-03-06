package Generics;

import java.util.ArrayList;

public class Try {
    public static void main(String[] args) {
        ArrayList<String> List=new ArrayList<>();
        List.add("Hello");
        List.add("World");
        String s = List.get(0);
        String s1 = List.get(1);
        System.out.println(s);
        System.out.println(s1);
    }
}
