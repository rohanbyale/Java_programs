import java.util.Arrays;
import java.util.Scanner;

public class MultiplyMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter outer array Size");
        int outerSize = sc.nextInt();
        System.out.println("Enter inner array size");
        int innerSize = sc.nextInt();

        int a[][] = new int[outerSize][innerSize];

        System.out.println("Enter array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix");

        System.out.println("Enter outer array Size");
        int outerSize1 = sc.nextInt();
        System.out.println("Enter inner array size");
        int innerSize2 = sc.nextInt();

        int b[][] = new int[outerSize1][innerSize2];

        System.out.println("Enter array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        int c[][] = new int[a.length][b.length];
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 1; j++) {
                int sum = 0;
                for (int k = 0; k <= a.length - 1; k++) {
                    sum = sum + a[i][k] * b[k][j];
                }

                c[i][j] = sum;
            }
        }

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j < c[i].length - 1; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

}
