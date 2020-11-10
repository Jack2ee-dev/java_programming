import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse2 {
    private Map<String, Map<String, Integer>> productPrices = new HashMap<>();
    private Map<String, Map<String, Integer>> productStocks = new HashMap<>();

    public Warehouse2() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        Map<String, Integer> productPrice = new HashMap<>();
        Map<String, Integer> productStock = new HashMap<>();
        productPrice.put("price", price);
        productStock.put("stock", stock);
        this.productPrices.put(product, productPrice);
        this.productStocks.put(product, productStock);
    }

    public int price(String product) {
        if (!this.productPrices.containsKey(product)) {
            return -99;
        }
        return this.productPrices.get(product).get("price");
    }

    public int stock(String product) {
        if (!this.productStocks.containsKey(product)) {
            return 0;
        }
        return this.productStocks.get(product).get("stock");
    }

    public boolean take(String product) {
        if (!this.productStocks.containsKey(product)) {
            return false;
        }
        int currentStock = this.productStocks.get(product).get("stock");
        if (currentStock > 0) {
            this.productStocks.get(product).put("stock", currentStock - 1);
            return true;
        }
        return false;
    }

    public Set<String> products() {
        return this.productPrices.keySet();
    }
}
