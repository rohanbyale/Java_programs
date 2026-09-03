
import java.util.Scanner;
import java.util.Arrays;

/**
 * Demo
 */
public class EvenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("Given array is " + Arrays.toString(a));

        for (int i = 1; i <= a.length - 1; i++) {
            if (a[i] % 2 == 0)
                System.out.println(a[i]);
        }

    }
}
