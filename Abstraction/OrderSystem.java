import java.util.Scanner;

public class OrderSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter choice");
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("enter item");
        String item = sc.next();
        DeliveryPartner ob = DeliveryFactory.getParternerObject(choice);
        Oderservice os = new Oderservice();
        os.placeOrder(ob, item);

    }

}

// -> Facotry class
class DeliveryFactory {
    public static DeliveryPartner getParternerObject(int choice) {
        DeliveryPartner ob = null;
        switch (choice) {

            case 1 -> ob = new SwiggyDelivery();
            case 2 -> ob = new ZomatoDelivery();
            case 3 -> ob = new DodoDelivery();

        }
        return ob;
    }
}

class Oderservice {
    public void placeOrder(DeliveryPartner partner, String item) {

        if (partner.deliveryOrder(item)) {
            System.out.println("Order is placed susccessfully");
        } else {
            System.out.println("Delivery failed");
        }

    }
}

interface DeliveryPartner {
    boolean deliveryOrder(String item);
}

class SwiggyDelivery implements DeliveryPartner {

    public boolean deliveryOrder(String item) {
        System.out.println("Delivery is placed via swiggy");
        return true;
    }
}

class ZomatoDelivery implements DeliveryPartner {

    public boolean deliveryOrder(String item) {
        System.out.println("Delivery is placed via zomato");
        return true;
    }
}

class DodoDelivery implements DeliveryPartner {
    public boolean deliveryOrder(String item) {
        System.out.println("Delivery is placed via doddo");
        return true;
    }
}
