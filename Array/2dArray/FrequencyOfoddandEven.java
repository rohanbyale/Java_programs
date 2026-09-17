import java.util.Scanner;

public class FrequencyOfoddandEven {
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

        int evencount = 0;
        int oddcount = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a[i].length - 1; j++) {
                if (a[i][j] % 2 == 0) {
                    evencount++;
                } else {
                    oddcount++;
                }
            }
        }

        System.out.println("Even count " + evencount);
        System.out.println("Odd count " + oddcount);
    }
}
