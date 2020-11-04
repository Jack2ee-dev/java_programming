public class LiquidContainers {
    private int firstHold;
    private int secondHold;
    private static int max = 100;
    private static int min = 0;

    public LiquidContainers() {
        this.firstHold = 0;
        this.secondHold = 0;
    }

    public void add(int amount) {
        if (amount <= LiquidContainers.min) {
            return;
        }
        if (this.firstHold + amount > LiquidContainers.max) {
            this.firstHold = LiquidContainers.max;
            return;
        }
        this.firstHold += amount;
    }

    public void move(int amount) {
        if (amount <= LiquidContainers.min) {
            return;
        }
        if (this.firstHold - amount < LiquidContainers.min) {
            this.firstHold = LiquidContainers.min;
        } else {
            this.firstHold -= amount;
        }
        if (this.secondHold + amount > LiquidContainers.max) {
            this.secondHold = LiquidContainers.max;
        } else {
            this.secondHold += amount;
        }
    }

    public void remove(int amount) {
        if (amount <= LiquidContainers.min) {
            return;
        }
        if (this.secondHold - amount < LiquidContainers.min) {
            this.secondHold = LiquidContainers.min;
        } else {
            this.secondHold -= amount;
        }
    }

    @Override
    public String toString() {
        String firstContainerStatement = "First: " + this.firstHold + "/" + LiquidContainers.max;
        String secondContatinerStatement = "Second: " + this.secondHold + "/" + LiquidContainers.max;
        return String.format("%s%n%s", firstContainerStatement, secondContatinerStatement);
    }
}
