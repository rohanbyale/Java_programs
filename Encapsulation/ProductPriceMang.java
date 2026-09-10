import java.util.Scanner;

public class ProductPriceMang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id : ");
        int productId = sc.nextInt();
        System.out.println("Enter Product Name : ");
        String productName = sc.next();
        System.out.println("Enter Product Price : ");
        double price = sc.nextDouble();
        System.out.println("Enter Discount : ");
        double percentage = sc.nextDouble();

        Product p = new Product();
        p.setId(productId);
        p.setName(productName);
        p.setPrice(price);

        System.out.println("Product Id : " + p.getId());
        System.out.println("Product Name :" + p.getName());
        System.out.println("Product Price : " + p.getPrice());
        p.applyDiscount(percentage);
    }
}

class Product {
    private int productId;
    private String productName;
    private double price;

    public void setId(int productId) {
        this.productId = productId;

    }

    public int getId() {
        return productId;
    }

    public void setName(String productName) {
        this.productName = productName;
    }

    public String getName() {
        return productName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void applyDiscount(double percentage) {
        double discountAmount = getPrice() * percentage / 100;
        double newPrice = getPrice() - discountAmount;
        System.out.println("Final Price : " + newPrice);
    }
}
