import java.util.Arrays;
import java.util.Scanner;

public class ProductofArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }
        int product = 1;

        for (int num : a) {
            product = product * num;
        }

        System.out.println("Product of Given Array is : " + product);

    }

}
