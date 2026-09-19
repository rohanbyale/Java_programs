import java.util.Scanner;

public class IdentityMatrix {
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

        boolean isIdentity = true;
        outer: for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0)) {
                    isIdentity = false;
                    break outer;
                }
            }
        }

        if (isIdentity) {
            System.out.println("it is Identified");
        } else {
            System.out.println("It is not  Identified");
        }
    }

}
