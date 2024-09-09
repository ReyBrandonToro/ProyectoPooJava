import java.util.HashMap;
import java.util.Map;
public class Order {
    private HashMap<Product, Integer> products;  
    private double total;

    
    public Order() {
        this.products = new HashMap<>();
        this.total = 0;
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

    public HashMap<Product, Integer> getProductos() {
        return products;
    }

    public void agregarProductosDesdeCarrito(Cart cart) {
        this.products = new HashMap<>(cart.getProductos());
        cart.emptyCart();
    }
}
