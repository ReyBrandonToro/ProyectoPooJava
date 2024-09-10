import java.util.HashMap;
import java.util.Map;

public class Order {
    private HashMap<Product, Integer> products;  
    private double total;

    public Order(Cart cart) {  // Composition: Order is created based on a Cart
        this.products = new HashMap<>(cart.getProducts());
        this.total = 0;
        cart.emptyCart();
    }

    public void calculateTotal() {
        double totalTemp = 0;
        for (Map.Entry<Product, Integer> entry : products.entrySet()) {
            totalTemp += entry.getKey().getPrice() * entry.getValue();
        }
        this.total = totalTemp;
    }

    public double getTotal() {
        return total;
    }

    public HashMap<Product, Integer> getProducts() {
        return products;
    }
}

