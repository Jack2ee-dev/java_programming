import java.util.HashMap;
import java.util.Map;

public class IOU {
    private Map<String, Double> ious = new HashMap<>();

    public IOU() {
    }

    public void setSum(String toWhom, double amount) {
        this.ious.put(toWhom, amount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        return this.ious.getOrDefault(toWhom, (double) 0);
    }
}
