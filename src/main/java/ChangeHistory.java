import java.util.ArrayList;
import java.util.List;

public class ChangeHistory {
    private List<Double> history;

    public ChangeHistory() {
        this.history = new ArrayList<>();
    }

    public void add(double status) {
        this.history.add(status);
    }

    public void clear() {
        this.history = new ArrayList<>();
    }

    public double maxValue() {
        double max = Double.MIN_VALUE;
        for (double d : this.history) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }

    public double minValue() {
        double min = Double.MAX_VALUE;
        for (double d : this.history) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }

    public double average() {
        double sum = 0;
        for (double d : this.history) {
            sum += d;
        }

        return sum / this.history.size();
    }

    @Override
    public String toString() {
        return this.history.toString();
    }
}
