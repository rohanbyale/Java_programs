import java.util.Arrays;
import java.util.Scanner;

public class CopyArrayElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of The Array");
        int size = sc.nextInt();

        int a[] = new int[size];

        int[] b = new int[a.length];
        
        System.out.println("Enter Array Elment one by one");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
            b[i] = a[i];
        }


        // int[] b = new int[a.length];
        // for (int i = 0; i <= a.length - 1; i++) {
        // b[i] = a[i];
        // }

        System.out.println("B array : = " + Arrays.toString(b));

    }
}
