import java.util.*;

public class CloudBill {
    public static void main(String[] args) {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1 -> {
                int hoursUsed = sc.nextInt();

                double gb = sc.nextDouble();
                boolean peahhours = sc.nextBoolean();
                BasicCompute b = new BasicCompute();
                System.out.println("Total Cloud Bill: " + b.calculateBill(hoursUsed, gb, peahhours));
            }

            case 2 -> {
                int hoursUsed = sc.nextInt();
                if (hoursUsed <= 0) {
                    System.out.println("Error: Hours used must be greater than 0");
                    return;
                }
                double gb = sc.nextDouble();
                boolean peahhours = sc.nextBoolean();
                PremiumCompute p = new PremiumCompute();
                System.out.println("Total Cloud Bill: " + p.calculateBill(hoursUsed, gb, peahhours));
            }
        }

    }
}

interface Cloudservice {
    public double calculateBill(int hoursUsed, double gb, boolean peahhours);
}

class BasicCompute implements Cloudservice {
    public double calculateBill(int hoursUsed, double gb, boolean peahhours) {
        int basecost = 200;

        double usageCost = (hoursUsed * 15) + (gb * 5);
        double peakcharge = 0;
        if (peahhours) {
            peakcharge = usageCost * 10 / 100;
        }

        double totalbill = basecost + usageCost + peakcharge;
        return totalbill;
    }
}

class PremiumCompute implements Cloudservice {
    public double calculateBill(int hoursUsed, double gb, boolean peahhours) {
        int basecost = 500;
        double usageCost = (hoursUsed * 30) + (gb * 8);
        double peakcharge = 0;
        if (peahhours) {
            peakcharge = usageCost * 20 / 100;
        }

        double totalbill = basecost + usageCost + peakcharge;
        return totalbill;
    }
}
