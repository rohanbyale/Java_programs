package objectclass;

import java.util.*;

public class HashCodeMethod {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String seat1 = sc.nextLine();
        String passengerName = sc.nextLine();
        String travelclass = sc.nextLine();

        String seat2 = sc.nextLine();
        String passengerName2 = sc.nextLine();
        String travelclass2 = sc.nextLine();

        FlightSeat ob = new FlightSeat(seat1, passengerName, travelclass);
        FlightSeat obj = new FlightSeat(seat2, passengerName2, travelclass2);

        if (seat1.length() < 2) {
            System.out.println("Error: Seat number length must be between 2 and 5");
            System.exit(0);
        }

        System.out.println("Seat1 hashCode: " + ob.hashCode());
        System.out.println("Seat2 hashCode: " + obj.hashCode());

        if (ob.hashCode() == obj.hashCode()) {
            System.out.println("Hash codes are equal");
        } else {
            System.out.println("Hash codes are different");
        }

    }
}

class FlightSeat {
    public String seatNumber;
    public String passengerName;
    public String travelclass;

    public FlightSeat(String seatNumber, String passengerName, String travelclass) {
        this.seatNumber = seatNumber;
        this.passengerName = passengerName;
        this.travelclass = travelclass;
    }

    public int hashCode() {
        return seatNumber.hashCode();

    }

}
