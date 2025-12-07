public class UserAccount {
    private String username;
    private String email;
    private double balance;

    public UserAccount(String username, String email, double balance) {
        this.username = username;
        setEmail(email);  
        this.balance = Math.max(balance, 0);  
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    public double getBalance() {
        return balance;
    }
    public void updateEmail(String newEmail) {
        setEmail(newEmail);
    }
    private void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Invalid email.");
        }
    }
}
