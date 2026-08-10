import java.util.Scanner;

public class ArmstrongRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number");
        int first = sc.nextInt();
        System.out.println("Enter second Number");
        int end = sc.nextInt();

        for (int i = first; i <= end; i++) {
            int temp = i;
            int count = 0;
            while (temp != 0) {
                count++;
                temp = temp / 10;
            }
            temp = i;
            double power = 0;
            double sum = 0;
            while (temp != 0) {
                int ld = temp % 10;
                power = Math.pow(ld, count);
                sum = sum + power;
                temp = temp / 10;

            }
            if ((int) sum == i) {
                System.out.println(i);
            }

        }
    }
}
