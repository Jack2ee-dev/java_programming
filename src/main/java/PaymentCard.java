public class PaymentCard {
    private double balance;

    public PaymentCard(int balance) {
        this.balance = balance;
    }

    public double balance() {
        return this.balance;
    }

    public void addBalance(double increase) {
        this.balance = this.balance + increase;
    }

    public boolean takeMoney(double amount) {
        if (balance < amount) {
            return false;
        }
        this.balance = this.balance - amount;
        return true;
    }
}
