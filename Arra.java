import java.util.Arrays;
import java.util.Scanner;

public class Arra {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the array elements one by one");

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int n = a[a.length - 1];
        int totalsum = n * (n + 1) / 2;
        int arraysum = 0;
        for (int num : a) {
            arraysum += num;
        }
        if (totalsum == arraysum) {
            System.out.println("no missing element");
        } else {
            System.out.println("missing element is " + (totalsum - arraysum));
        }
    }

}
