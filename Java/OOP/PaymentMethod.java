public interface PaymentMethod {
    void pay(double amount);
    void refund(double amount);
}
