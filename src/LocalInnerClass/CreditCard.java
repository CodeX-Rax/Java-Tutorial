package LocalInnerClass;

public class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Paid" + amount + " Using Credit Card");
    }
}
