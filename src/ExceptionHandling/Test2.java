//use of concept finally
package ExceptionHandling;

public class Test2 {
    public static void main(String args[]){
        System.out.println(divide(5,5));

    }
    public static int divide(int a,int b){
        try{
            return a/b;
        } catch (Exception e) {
            System.out.println(e);
            return -1;
        } finally {
            System.out.println("bye!");
        }
    }
}
