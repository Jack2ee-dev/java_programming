import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StorageFacility {
    private Map<String, ArrayList<String>> facilities;

    public StorageFacility() {
        this.facilities = new HashMap<>();
    }

    public void add(String unit, String item) {
        this.facilities.putIfAbsent(unit, new ArrayList<>());

        ArrayList<String> added = this.facilities.get(unit);
        added.add(item);
    }

    public ArrayList<String> contents(String storingUnit) {
        return this.facilities.getOrDefault(storingUnit, new ArrayList<>());
    }

    public void remove(String storageUnit, String item) {
        if (this.facilities.get(storageUnit).size() <= 1) {
            this.facilities.remove(storageUnit);
            return;
        }
        ArrayList<String> removed = this.facilities.get(storageUnit);
        removed.remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> units = new ArrayList<>();
        for (String unit : this.facilities.keySet()) {
            if (this.facilities.get(unit).size() > 0) {
                units.add(unit);
            }
        }
        return units;
    }
}
