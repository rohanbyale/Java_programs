package Abstract;

/**
 * AbstractDemo
 */
public class AbstractDemo {

}

abstract class Product {
    private String name;
    private double price;
    private String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public abstract void applyDiscount(double percentage);
    public abstract void calculateTax();

    public double getPrice(){
        return price;
    }

    public void setPrice(double newPrice){
        this.price = newPrice;
    }

    public void displayDetials(){
        System.out.println("Product Name: "+name);
        System.out.println("Category: "+category);
        System.out.println("Price RS: "+price);
        
    }

} 
