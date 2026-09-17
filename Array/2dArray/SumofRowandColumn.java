import java.util.Scanner;

public class SumofRowandColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int outerSize = sc.nextInt();
        int innerSize = sc.nextInt();

        int a[][] = new int[outerSize][innerSize];
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= a.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j <= a[i].length - 1; j++) {
                sum = sum + a[i][j];
            }

            System.out.println("Sum of " + (i + 1) + " row is " + sum);
        }

        for (int i = 0; i <= a.length - 1; i++) {
            int sum = 0;
            for (int j = 0; j <= a[i].length - 1; j++) {
                sum = sum + a[j][i];

            }
            System.out.println("Sum of " + (i + 1) + " colum is " + sum);
        }

    }
}
