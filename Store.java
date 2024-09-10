import java.util.ArrayList;
import java.util.List;

public class Store {
    private String name;
    private ArrayList<Product> products;  
    private ArrayList<User> users; 
    private ArrayList<Order> orders; 

    public Store(String name) {  // Added constructor for Store
        this.name = name;
        this.products = new ArrayList<>();
        this.users = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public List<User> getUsers() {
        return users;
    }

    public void addOrder(Order order) {
        orders.add(order); 
    }

    public List<Order> getOrders() {
        return orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

