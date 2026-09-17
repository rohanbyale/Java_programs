
import java.util.Scanner;
import java.util.Arrays;

class InsertingNewElement {
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

        int n = sc.nextInt();
        int b[] = new int[size + 1];
        for (int i = 0; i <= a.length - 1; i++) {
            b[i] = a[i];
        }
        b[size] = n;
        System.out.println(Arrays.toString(b));
    }
}
