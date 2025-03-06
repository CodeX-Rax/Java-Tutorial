package List_CollectionFramework;

import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListt {
    public static void main(String[] args) {
        CopyOnWriteArrayList<String> list =new CopyOnWriteArrayList<>();
        //"Copy on Write" means that whenever a write operatipn
        //like adding or removing an element
        //instead of directly modifying  the existing list
        //a new copy of list is created, and modification is applied to that copy
        //this ensure that other threads reading  the list  while it's being modified are unaffected

        //Read operations: fast and direct, since they happened on stable list without interference from modification
        //write operations: a new copy is created for every modification
        list.add("vvr");
        list.add("gfvds");
        list.add("vsv d");
        list.add("dvff");
        list.add("svd");
        for( String x : list){
            System.out.println(x);
            if (x.equals("vsv d")){
                list.add("342");
                System.out.println("Successfully added");
            }
        }
        System.out.println("Updated list "+list);
    }
}
