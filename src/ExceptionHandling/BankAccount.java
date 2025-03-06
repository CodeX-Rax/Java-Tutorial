package ExceptionHandling;

public class BankAccount {

    private double amount;
    private double balance;

    public BankAccount(double amount) {
        this.amount = amount;
    }
    public void withdraw(double amount) throws Exception {
        if (amount>balance){
            throw new InsufficientFundsException();
        }
        balance -=amount;
    }
}
