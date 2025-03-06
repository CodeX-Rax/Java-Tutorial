package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Throw {
    public static void main(String args[]) throws IOException {
        method2();
        System.out.println("hello");
    }
    public static void method2() throws FileNotFoundException {
        method1();
    }
    public static void method1() throws FileNotFoundException {
        try{
            FileReader fileReader =new FileReader("a.txt");
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
            throw new FileNotFoundException("Oops");
        }

    }

}
