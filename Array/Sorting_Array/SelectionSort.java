import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        for (int i = 0; i <= a.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;

        }
        System.out.println(Arrays.toString(a));
    }
}
