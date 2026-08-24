
import java.util.Scanner;

public class ProductSystem {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        double price = sc.nextDouble();
        int quantity = sc.nextInt();
        double discount = sc.nextDouble();

        Discount obj = new Discount(name, price, quantity, discount);

        obj.displayDetails();
        // System.out.println( obj.calculateTotal());

    }
}

class Product {

    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;

    }

    public void displayDetails() {
        System.out.println("Product name: " + name);
        System.out.println("Price " + price);
        System.out.println("quantity " + quantity);
        System.out.println("Discount " + calculateTotal());
    }

    public double calculateTotal() {
        return price * quantity;
    }

}

class Discount extends Product {

    public double discount;

    public Discount(String name, double price, int quantity, double discount) {
        super(name, price, quantity);
        this.discount = discount;

    }

    public void displayDetails() {
        super.displayDetails();
    }

    public double calculateTotal() {
        double total = super.calculateTotal();
        return total - ((total * discount) / 100);
    }
}
