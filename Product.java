public class Product {
    private String name;
    private double priece;

    public Product() {
        this.name = null;
        this.priece = 0.0;
    }

    public void registarProduct(String name, double priece) {
        this.name = name;
        this.priece = priece;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return priece;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPrice(double priece) {
        this.priece = priece;
    }

}
