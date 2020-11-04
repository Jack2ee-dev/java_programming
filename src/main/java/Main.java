import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		ProductWarehouseWithHistory juice = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
		juice.takeFromWarehouse(11.3);
		juice.addToWarehouse(1.0);
		// System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

		juice.printAnalysis();
	}
}
