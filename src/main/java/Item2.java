public class Item2 {
    private String product;
    private int qty;
    private int unitPrice;

    public Item2(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.qty * this.unitPrice;
    }

    public void increaseQuantity() {
        this.qty += 1;
    }

    public String product() {
        return this.product;
    }

    @Override
    public String toString() {
        return this.product + ": " + this.qty;
    }
}
