//this is how you made your own exception
package ExceptionHandling;

public class InsufficientFundsException extends Exception{
    public InsufficientFundsException(){
        super("What do you want ? You don't have money");
    }
}
