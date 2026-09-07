import java.util.Scanner;

/**
 * Diff
 */
public class Diff {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        int max = a[0];
        int min = a[0];

        for (int num : a) {
            if (max < num)
                max = num;

            if (num < min)
                min = num;

        }
        System.out.println("Difference is " + (max - min));
        // System.out.println(min);
    }
}
