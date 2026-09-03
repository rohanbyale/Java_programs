
import java.util.Scanner;
import java.util.Arrays;

/**
 * Demo
 */
public class SumofArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }
        int sum = 0;
        for (int e : a) {
            sum = sum + e;
        }

        System.out.println("Sum is " + sum);

    }
}
