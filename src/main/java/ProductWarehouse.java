public class ProductWarehouse extends Warehouse {
    private String name;

    public ProductWarehouse(String name, double capacity) {
        super(capacity);
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return this.name + ": " + super.toString();
    }
}
