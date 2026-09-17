import java.util.Scanner;

public class SparxMatrics {
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

        int count = 0;
        outer: for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (a[i][j] == 0) {
                    count++;
                }
            }
        }

        if (count > (9 / 2)) {
            System.out.println("Sparx Matrics");
        } else {
            System.out.println("Not a sparx matrics");
        }
    }

}
