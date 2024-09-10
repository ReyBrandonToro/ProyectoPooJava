import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String email;
    private Cart cart;  
    private List<Order> orders;  

    public User(String name, String email) {  // Added constructor for User
        this.name = name;
        this.email = email;
        this.cart = new Cart();  
        this.orders = new ArrayList<>();  
    }

    public Cart getCart() {
        return cart;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void createOrder() {
        Order newOrder = new Order(cart);
        newOrder.calculateTotal();
        orders.add(newOrder);
    }
}

