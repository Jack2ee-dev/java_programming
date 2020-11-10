import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item2> cartItems;

    public ShoppingCart() {
        this.cartItems = new ArrayList<>();
    }

    public void add(String product, int price) {
        List<String> productNames = new ArrayList<>();
        for (Item2 item : cartItems) {
            productNames.add(item.product());
        }

        if (productNames.contains(product)) {
            cartItems.get(productNames.indexOf(product)).increaseQuantity();
            return;
        }
        Item2 newItem = new Item2(product, 1, price);
        this.cartItems.add(newItem);
    }

    public int price() {
        int sum = 0;
        for (Item2 item : cartItems) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item2 item : cartItems) {
            System.out.println(item);
        }
    }
}
