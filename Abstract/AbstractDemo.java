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

    public abstract double calculateTax();

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void displayDetials() {
        System.out.println("Product Name: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price RS: " + price);

    }

}

class digitalProduct extends Product {
    private String licenseKey;

    public digitalProduct(String name, double price, String category, String licenseKey) {
        super(name, price, category);
        this.licenseKey = licenseKey;
    }

    public void applyDiscount(double percentage) {
        double discount = getPrice() * percentage / 100;
        double newPrice = getPrice() - discount;
        System.out.println("Discount applied: " + discount);
        System.out.println("New Price: " + newPrice);

    }

    public double calculateTax() {
        return 0.05 * (getPrice() - (percentage / 100.0) * getPrice());
    }

    public void displayDetials() {
        super.displayDetials();
        System.out.println("License Key: " + licenseKey);
        applyDiscount(getPrice());
        System.out.println(calculateTax());

    }

}