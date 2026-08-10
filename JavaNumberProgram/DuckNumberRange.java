import java.util.Scanner;

public class DuckNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting Number");
        int start = sc.nextInt();
        System.out.println("Enter Ending Number");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            int num = i;
            int product = 1;
            while (num != 0) {
                int ld = num % 10;
                product = ld * product;
                num = num / 10;
            }

            if (product == 0) {
                System.out.println(i);
            }
        }

    }

}
