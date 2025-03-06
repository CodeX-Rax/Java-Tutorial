//we made box class generics
//link for generics Notes : https://engineeringdigest.medium.com/generics-b158a743d18f
package Generics;

class Box<T>{//Type
    private T value;
    public T getValues(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class ToCreateGenerics {
    public static void main(String[] args) {
        Box<Integer> box=new Box<>();//this diamond Bracket known as Generics
        box.setValue(1);
        box.setValue(2);
        int val1=box.getValues();
        int val = box.getValues();
        System.out.println(val);
        System.out.println(val1);
    }

}
