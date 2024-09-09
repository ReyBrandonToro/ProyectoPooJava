import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String mail;
    private Cart cart;  
    private List<Order> orders;  

    public User() {
        this.name = null;
        this.mail = null;
        this.cart = new Cart();  
        this.orders = new ArrayList<>();  
    }

   
    public Cart getCart() {
        return cart;
    }

    public void agregarPedido(Order order) {
        orders.add(order);
    }

    public List<Order> getPedidos() {
        return orders;
    }

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public String getMail() {
        return mail;
    }

    public void SetMail(String mail){
        this.mail=mail;
    }

    public void registrarUsuario(String name,String mail){
        this.name = name;
        this.mail = mail;
    }

    public void crearPedido() {
        Order nuevoPedido = new Order();
        nuevoPedido.agregarProductosDesdeCarrito(cart);
        nuevoPedido.calculateTotal();
        orders.add(nuevoPedido);
    }
}
