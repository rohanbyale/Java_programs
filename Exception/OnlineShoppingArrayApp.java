
import java.util.*;

class EmptyCartException extends Exception {
    public EmptyCartException(String message) {
        super(message);
    }
}

class InsufficientPaymentException extends Exception {
    public InsufficientPaymentException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class Product {
    String name;
    int price;
    int stock;

    Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class CartItem {
    Product product;
    int quantity;

    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    int getTotalPrice() {
        return product.price * quantity;
    }
}

class CheckoutSystemArray {

    CartItem[] cart;
    int cartSize;
    int paymentAmount;

    CheckoutSystemArray(CartItem[] cart, int cartSize, int paymentAmount) {
        this.cart = cart;
        this.cartSize = cartSize;
        this.paymentAmount = paymentAmount;
    }

    void processCheckout() {

        try {

            if (cartSize == 0) {
                throw new EmptyCartException(
                        "Cart is empty. Cannot checkout.");
            }

            int total = 0;

            for (int i = 0; i < cartSize; i++) {

                CartItem item = cart[i];

                if (item.quantity > item.product.stock) {
                    throw new OutOfStockException(
                            "Product " + item.product.name +
                                    " quantity exceeds stock");
                }

                total += item.getTotalPrice();
            }

            if (paymentAmount < total) {
                throw new InsufficientPaymentException(
                        "Insufficient Payment");
            }

            System.out.println(
                    "Checkout Successful! Total Paid: " + paymentAmount);

        } catch (EmptyCartException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientPaymentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (OutOfStockException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Checkout Attempt Completed");
        }
    }
}

public class OnlineShoppingArrayApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] products = new Product[3];

        products[0] = new Product("Laptop", 1000, 5);
        products[1] = new Product("Phone", 500, 10);
        products[2] = new Product("Headphones", 200, 8);

        CartItem[] cart = new CartItem[10];

        int cartSize = 0;

        while (true) {

            int productNumber = sc.nextInt();
            int quantity = sc.nextInt();

            cart[cartSize] = new CartItem(products[productNumber - 1], quantity);

            cartSize++;

            String choice = sc.next();

            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        int paymentAmount = sc.nextInt();

        CheckoutSystemArray checkout = new CheckoutSystemArray(
                cart,
                cartSize,
                paymentAmount);

        checkout.processCheckout();

        sc.close();
    }
}
