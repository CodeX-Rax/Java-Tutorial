package LocalInnerClass;

public class ShopingCart {
    private double totalAmount;

    public ShopingCart(double totalAmount) {
        this.totalAmount = totalAmount;
    }
    public void processPayment(Payment paymentMethod){
        paymentMethod.pay(totalAmount);

    }
}
