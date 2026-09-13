import java.util.Scanner;

public class CheckArrayEqal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        System.out.println("Enter second array");
        System.out.println("Enter the size");
        int size2 = sc.nextInt();

        int[] b = new int[size2];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= b.length - 1; i++) {

            b[i] = sc.nextInt();

        }

        if (a.length != b.length) {
            System.out.println("Array are not equal");
            return;
        }

        for (int i = 0; i <= a.length - 1; i++) {
            boolean isPresent = false;

            for (int j = 0; j <= b.length - 1; j++) {
                if (a[i] == b[j]) {
                    isPresent = true;
                    break;
                }

            }

            if (isPresent == false) {
                System.out.println("Array are not equal");
            } else {
                System.out.println("Array are equal");
                System.exit(0);
            }
        }

    }
}
