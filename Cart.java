import java.util.HashMap;
public class Cart {
    
    private HashMap<Product, Integer> products;  

    public Cart() {
        this.products = new HashMap<>();
    }

   
    public void addProduct(Product product, int quantity) {
        if (products.containsKey(product)) {
            products.put(product, products.get(product) + quantity);  
        } else {
            products.put(product, quantity);  
        }
    }

    public void deleteProduct(Product product) {
        products.remove(product);
    }

    public double calculateSubTotal() {
        double total = 0;
        for (HashMap.Entry<Product, Integer> entry : products.entrySet()) {
            Product producto = entry.getKey();
            int cantidad = entry.getValue();
            total += producto.getPrice() * cantidad;
        }
        return total;
    }

    public void emptyCart() {
        products.clear();
    }

    public HashMap<Product, Integer> getProductos() {
        return products;
    }
}
