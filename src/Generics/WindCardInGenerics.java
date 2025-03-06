package Generics;

import java.util.ArrayList;
import java.util.Objects;

public class WindCardInGenerics {
    public static void main(String[] args) {

    }
    public <T> T getFirst(ArrayList<T> list){       //WildCard in generics
        return list.get(0);
    }
}
