package objectclass;

/**
 * FoodDeliveryOrderSummery
 */
import java.util.*;

public class FoodDeliveryOrderSummery {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        String restaurantName = sc.nextLine();
        String city = sc.nextLine();
        String orderid = sc.nextLine();
        double foodamount = sc.nextDouble();
        double deliveryFee = sc.nextDouble();

        DeliveryOrder ob = new DeliveryOrder(restaurantName, city, orderid, foodamount, deliveryFee);
        System.out.println(ob);

    }
}

class Restaurant {
    public String restaurantName;
    public String city;

    public Restaurant(String restaurantName, String city) {
        this.restaurantName = restaurantName;
        this.city = city;
    }

    public String toString() {
        return "Restaurant: " + restaurantName + "\n" + "City: " + city + "\n";
    }
}

class FoodOrder extends Restaurant {
    public String orderid;
    public double foodamount;

    public FoodOrder(String restaurantName, String city, String orderid, double foodamount) {
        super(restaurantName, city);
        this.orderid = orderid;
        this.foodamount = foodamount;
    }

    public String toString() {
        return super.toString() + "Order ID: " + orderid + "\n" + "Food Amount: " + foodamount + "\n";
    }
}

class DeliveryOrder extends FoodOrder {
    public double deliveryFee;

    public DeliveryOrder(String restaurantName, String city, String orderid, double foodamount, double deliveryFee) {
        super(restaurantName, city, orderid, foodamount);
        this.deliveryFee = deliveryFee;
    }

    public String toString() {
        double totalamount = foodamount + deliveryFee;
        return super.toString() + "Delivery Fee: " + deliveryFee + "\n" + " Total Amount: " + totalamount;
    }

}
