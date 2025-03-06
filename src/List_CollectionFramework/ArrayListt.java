package List_CollectionFramework;

import java.util.ArrayList;

public class ArrayListt {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(15);
        list.add(1);//Index 0
        list.add(23);//1
        list.add(44);//2 and so on
        list.add(56);
        list.add(67);
        list.add(8765);
        list.add(24);
        list.add(234);
        list.add(98);
        list.add(136);
        System.out.println("Size of an Array : " + list.size());
        System.out.println();


        //Print Whole Array
        System.out.println("Array Elements are : ");
        for (int x : list){
            System.out.println(x);
        }
        System.out.println("Size"+list.size());
        System.out.println();


        //"contains()" are used to find wheather particular element exist in existing in this Array.
        System.out.println("5 exist in Array: "+list.contains(5));
        System.out.println("44 exist in Array: "+list.contains(44));
        System.out.println();


        //"remove()" used to remove element of array with array index.
        System.out.println("This Element is Successfully Removed from Array : "+list.remove(4));
        System.out.println();


        //"add(index : , element : )" if kisi element ko niche lakr uske jagah dusra add krna hai.
        list.add(1,69);
        System.out.println(" After Replacing element Array Elements are : ");
        for (int x : list){
            System.out.println(x);
        }
        System.out.println("size"+list.size());


        //"set()" is used to replace element of an Array.
        System.out.println();
        list.set(2,69);
        System.out.println(" After Replacing element Array Elements are : ");
        for (int x : list){
            System.out.println(x);
        }
        System.out.println("Size"+list.size());

        //To print list use this "list"
        System.out.println(list);

        //"trimToSize()" is used to cut the Array size to memory effeciency


    }
}
