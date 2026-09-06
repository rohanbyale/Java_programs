import java.util.Arrays;
import java.util.Scanner;

public class ElementEvenindex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the array elements one by one");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array Element at Even Index");
        for (int i = 0; i <= a.length - 1; i += 2) {
            System.out.print(a[i] + " ");

        }

    }
}