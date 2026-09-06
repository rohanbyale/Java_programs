import java.util.Arrays;
import java.util.Scanner;

public class Elementindex {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        System.out.println("Enter the array elements one by one");
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        System.out.println("Enter a Number");
        int n = sc.nextInt();

        for (int i = 0; i <= a.length - 1; i++) {
            if (a[i] == n) {
                System.out.println("Index of Given element is " + i);
            }
        }
    }
}