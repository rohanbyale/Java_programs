import java.util.Scanner;

class SwapValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int outerSize = sc.nextInt();
        int innerSize = sc.nextInt();

        int a[][] = new int[outerSize][innerSize];

        System.out.println("Enter array elements");
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (i < j) {
                    int temp = a[i][j];
                    a[i][j] = a[j][i];
                    a[j][i] = temp;
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