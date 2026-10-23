
class RideRequest extends Thread {
    public void run() {
        try {
            System.out.println("User requested a ride...");
            Thread.sleep(2000);
            System.out.println("Searching for nearby drivers...");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class DriverAssignment extends Thread {
    public void run() {
        try {
            Thread.sleep(3000);
            System.out.println("Driver found and assigned!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class FareCalculation extends Thread {
    public void run() {
        try {
            System.out.println("\tCalculating estimated fare...");
            Thread.sleep(1500);
            System.out.println("\tEstimated fare: 135.75 RS.");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class LiveTracking extends Thread {
    public void run() {
        try {
            for (int i = 20; i <= 100; i += 20) {
                System.out.println("\tUpdating ride location... "
                        + i + "% completed");
                Thread.sleep(500);
            }
            System.out.println("\tRide completed!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class PaymentProcessing extends Thread {
    public void run() {
        try {
            System.out.println("\tProcessing payment...");
            Thread.sleep(2000);
            System.out.println("\tPayment successful!");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class RatingSystem extends Thread {
    public void run() {
        try {
            System.out.println("\tRequesting user rating...");
            Thread.sleep(1000);
            System.out.println("\tUser rated the ride: 5 star");
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class OlaRidingApp {
    public static void main(String[] args)
            throws InterruptedException {

        RideRequest ride = new RideRequest();
        DriverAssignment driver = new DriverAssignment();
        FareCalculation fare = new FareCalculation();
        LiveTracking tracking = new LiveTracking();
        PaymentProcessing payment = new PaymentProcessing();
        RatingSystem rating = new RatingSystem();

        // 1. Start ride request and fare calculation together
        ride.start();
        fare.start();

        // 2. Wait until the ride request thread finishes
        ride.join();

        // 3. Assign the driver
        driver.start();
        driver.join();

        // 4. Wait for fare calculation to finish
        fare.join();

        // 5. Start live tracking
        tracking.start();
        tracking.join();

        // 6. Process payment
        payment.start();
        payment.join();

        // 7. Ask for rating
        rating.start();
        rating.join();
    }
}
