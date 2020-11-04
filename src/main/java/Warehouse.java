public class Warehouse {
    private double capacity;
    private double amount;

    public Warehouse(double capacity) {
        if (capacity < 0) {
            this.capacity = 0;
            return;
        }
        this.capacity = capacity;
        this.amount = 0;
    }

    public double getBalance() {
        return this.amount;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.amount;
    }

    public void addToWarehouse(double amount) {
        if (this.amount + amount > capacity) {
            this.amount = this.capacity;
            return;
        }
        this.amount += amount;
    }

    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0;
        }

        if (amount > this.amount) {
            this.amount = 0;
            return this.amount;
        }

        this.amount -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return "balance = " + this.amount + ", space left " + this.howMuchSpaceLeft();
    }
}
