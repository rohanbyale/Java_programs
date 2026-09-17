import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();

        if (size < 0) {
            System.out.println("Invalid Array Size");
            return;
        }

        int a[] = new int[size];

        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();

        }

        int b[] = new int[size];
        int k = 0; // index for b

        for (int i = 0; i <= a.length - 1; i++) {

            boolean isPresent = false;

            for (int j = 0; j < k; j++) {

                if (a[i] == b[j]) {
                    isPresent = true;
                    break;
                }

            }

            if (isPresent == false) {
                b[k] = a[i];
                k++;
            }
        }

        int result[] = new int[k];

        for (int i = 0; i < k; i++) {
            result[i] = b[i];
        }

        System.out.println("Array after removing duplicates: " + Arrays.toString(result));
    }
}