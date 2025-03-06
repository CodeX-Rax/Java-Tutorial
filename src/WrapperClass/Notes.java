package WrapperClass;

public class Notes {
}
/*
Wrapper class in java

In Java, a wrapper class is a class that wraps or "encapsulates" a primitive data type into an object.
This allows the primitive types (such as int, char, double, etc.) to be treated as objects, which is useful in situations where only objects can be used (e.g., in collections like ArrayList or HashMap).

Here are the wrapper classes for each of the primitive data types in Java:

byte → Byte
short → Short
int → Integer
long → Long
float → Float
double → Double
char → Character
boolean → Boolean
Example:java


        Program -->>

public class WrapperExample {
    public static void main(String[] args) {
        // Primitive data type
        int primitiveInt = 10;

        // Wrapper class (Integer)
        Integer wrapperInt = Integer.valueOf(primitiveInt);

        // Auto-boxing: automatically convert primitive to wrapper
        Integer autoBoxedInt = primitiveInt;

        // Unboxing: automatically convert wrapper to primitive
        int unboxedInt = wrapperInt;

        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Wrapper (using valueOf): " + wrapperInt);
        System.out.println("Auto-boxed: " + autoBoxedInt);
        System.out.println("Unboxed: " + unboxedInt);
    }
}


Key points about wrapper classes:
Auto-boxing: The automatic conversion of a primitive type to its corresponding wrapper class (e.g., int to Integer).
Unboxing: The automatic conversion of a wrapper class object to its corresponding primitive type (e.g., Integer to int).
Wrapper classes are also used to convert values between objects and strings, such as using Integer.parseInt() to convert a String to an int.

Why Use Wrapper Classes?
Collections: Java Collections (like ArrayList, HashMap) cannot hold primitive data types, so they require objects.
Nullability: Unlike primitive types, wrapper classes can be assigned null (i.e., they are objects), making them useful in scenarios where a value might be absent.
Utility Methods: Wrapper classes provide utility methods for parsing, converting, and manipulating values. For example, Integer.parseInt() or Double.valueOf().*/
