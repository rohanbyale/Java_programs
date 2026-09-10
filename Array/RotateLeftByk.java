import java.util.Arrays;
import java.util.Scanner;

public class RotateLeftByk {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");

        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array element one by one  : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the Number for Rotation : ");
        int k = sc.nextInt();
        for (int j = 1; j <= k; j++) {
            int temp = a[0];

            for (int i = 1; i <= a.length - 1; i++) {
                a[i - 1] = a[i];
            }
            a[a.length - 1] = temp;
        }
        System.out.println("Array after " + k + " Rotation is : " + Arrays.toString(a));
    }

}
