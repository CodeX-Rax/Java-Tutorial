package WrapperClass;

public class Test {
    public static void main(String[] args) {
        int a=5;
        Integer b=Integer.valueOf(a);//conversion of privitive datatypes to wrapper object by which we can use methods of INTEGER CLASS.
        System.out.println(b.doubleValue());
    }
}
