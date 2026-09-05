import java.util.Arrays;
import java.util.Scanner;

public class FirstReapetingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[i] == a[j]) {
                    System.out.println("First Reapting Number is" + a[i]);
                    found = true;
                    break;
                }

            }

            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not reapeatign: ");
        }

    }

}
