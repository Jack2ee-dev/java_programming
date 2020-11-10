import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		Warehouse2 warehouse = new Warehouse2();
		warehouse.addProduct("coffee", 5, 10);
		warehouse.addProduct("milk", 3, 20);
		warehouse.addProduct("cream", 2, 55);
		warehouse.addProduct("bread", 7, 8);

		Scanner scanner = new Scanner(System.in);

		Store store = new Store(warehouse, scanner);
		store.shop("John");
	}
}
