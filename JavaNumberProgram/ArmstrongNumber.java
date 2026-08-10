import java.util.Scanner;

/**
 * Main
 */
public class ArmstrongNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        int count = 0;
        while (temp != 0) {
            count++;
            temp = temp / 10;
        }

        temp = n;
        double sum = 0;
        double power = 0;
        while (temp != 0) {
            int ld = temp % 10;
            power = Math.pow(ld, count);
            sum = sum + power;
            temp = temp / 10;

        }
        if (sum == n) {
            System.out.println("Arm");
        } else {
            System.out.println("Not");
        }
    }
}