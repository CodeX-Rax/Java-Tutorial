//We can make Interface as a Generic-Interface
package Generics;
interface Container<T> {
    void add(T item);
    T get();


}
public class GenericContainer<T> implements Container<String>  {
    public static void main(String[] args) {

    }

    private T item;

    @Override
    public void add(String item) {

    }

    @Override
    public String get() {
        return "";
    }
}
