package ExceptionHandling;

public class NotesForThrowKeyword {
}
//throw are of two types
//checked exception and unchecked exception

/*1. Checked Exceptions
Checked exceptions are exceptions that are checked at compile-time.
These exceptions are required to be either caught or declared in the method signature using the throws keyword.
If the programmer fails to handle them properly, the code will not compile.

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistent_file.txt");
            Scanner sc = new Scanner(file);  // Throws FileNotFoundException
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}

2. Unchecked Exceptions
Unchecked exceptions are exceptions that are not checked at compile-time, and they are subclasses of RuntimeException.
These exceptions occur during runtime, and the compiler does not require you to explicitly handle or declare them.
It is not mandatory to catch or declare unchecked exceptions.

public class UncheckedExceptionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[5]);  // Throws ArrayIndexOutOfBoundsException
    }
}
*/


