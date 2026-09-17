
import java.util.Scanner;

class MidleIndexofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size <= 0) {
            System.out.println("Invalid Array size.");
            return;
        }
        int a[] = new int[size];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }

        if (size % 2 == 0) {
            int mid1 = a[size / 2 - 1];
            int mid2 = a[size / 2];
            System.out.println("Output is: " + mid1 + " " + mid2);
        } else {
            int mid = a[size / 2];
            System.out.println("Output is: " + mid);
        }
    }
}
