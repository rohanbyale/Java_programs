import java.util.Scanner;

public class upperTriangleMatrix {
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

            for (int j = 0; j <= a[i].length - 1; j++) {

                if (i > j) {
                    a[i][j] = 0;

                }

            }
        }

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = 0; j <= a[i].length - 1; j++) {
                System.out.print(a[i][j] + " ");

            }
            System.out.println();
        }

    }
}
