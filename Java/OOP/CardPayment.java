public class CardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Processing card payment of ₹" + amount);
    }

    @Override
    public void refund(double amount) {
        System.out.println("Refunding ₹" + amount + " to card.");
    }
}
