import java.util.ArrayList;
import java.util.List;

public class Herd implements Movable {
    private List<Movable> herds;

    public Herd() {
        this.herds = new ArrayList<>();
    }

    public void addToHerd(Movable movable) {
        this.herds.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable herd : this.herds) {
            herd.move(dx, dy);
        }
    }

    public String toString() {
        String s = "";
        for (Movable herd : this.herds) {
            s += herd + "\n";
        }
        return s;
    }

}
