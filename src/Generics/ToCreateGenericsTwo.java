package Generics;
class Boxx<K,V>{
    private K key;
    private V Value;

    public void setKey(K key,V value) {
        this.key = key;
        Value = value;
    }

    public Boxx(K key, V value) {
        this.key = key;
        Value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return Value;
    }
}
public class ToCreateGenericsTwo {
    public static void main(String[] args) {
        Boxx<Integer,String> boxx1=new Boxx<>(1,"Jai");
        //System.out.println(boxx1);//address mila isse
        //System.out.println(boxx1.getKey());
        System.out.println(boxx1.getValue());
        Boxx<Integer,String> boxx2=new Boxx<>(2,"Shri");
        //System.out.println(boxx2);//address mila isse
        //System.out.println(boxx2.getKey());
        System.out.println(boxx2.getValue());
        Boxx<Integer,String> boxx3=new Boxx<>(3,"Krishn");
        System.out.println(boxx3 .getValue());


    }
}

/*
T : Type
E : Element (used in collections)
K : Key (used in map)
V : Value (used in map)
N : Number

*/

