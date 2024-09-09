import java.util.ArrayList;
import java.util.List;
public class Store {
    private String name;
    private List<Product> products;  
    private List<User> Users; 
    private List<Order> orders; 

    public Store() {
        name=null;
        this.products = new ArrayList<>();
        this.Users = new ArrayList<>();
        this.orders=new ArrayList<>();
    }

    public void addProduct(Product producto) {
        products.add(producto);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addUser(User user) {
        Users.add(user);
    }

    public List<User> getUsers() {
        return Users;
    }

    public void addOrder(Order order) {
        orders.add(order); 
    }

    public List<Order> getOrders(){
        return orders;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

}
