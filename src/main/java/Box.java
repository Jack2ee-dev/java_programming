import java.util.ArrayList;
import java.util.List;

public class Box implements Packable {
    private Double capacity;
    private List<Packable> items;

    public Box(Double capacity) {
        this.capacity = capacity;
        this.items = new ArrayList<>();
    }

    public void add(Packable item) {
        if (this.weight() + item.weight() > capacity) {
            return;
        }
        this.items.add(item);
    }

    @Override
    public double weight() {
        double sum = 0.0;
        for (Packable item : items) {
            sum += item.weight();
        }
        return sum;
    }

    @Override
    public String toString() {
        return "Box: " + this.items.size() + " items, total weight " + this.weight() + "kg";
    }
}
