import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

       // int[] b = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = a[(a.length - 1) - i];
        }

        System.out.println(Arrays.toString(a));
    }

}
