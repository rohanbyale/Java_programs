import java.util.Scanner;

/**
 * Write a Java program where you define a static method called armstrongNumber.
The method should take an integer as argument and return true if the number is Armstrong otherwise return false.
 */

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (armStrong(num)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

    }

    public static boolean armStrong(int num) {
        int original = num;
        int count = 0;

        while (num != 0) {
            int ld = num % 10;
            count++;
            num = num / 10;

        }
        num = original;
        double power = 0;
        double sum = 0;

        while (num != 0) {
            int ld = num % 10;
            power = Math.pow(ld, count);
            sum = sum + power;
            num = num / 10;

        }

        return (int) sum == original;
    }

}