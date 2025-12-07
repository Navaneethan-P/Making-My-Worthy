public class UPIPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " through UPI.");
    }
}
