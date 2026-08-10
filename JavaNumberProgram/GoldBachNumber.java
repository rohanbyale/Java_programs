import java.util.Scanner;

public class GoldBachNumber {
    public static void main(String[] args) {
        int n = 30;
        for (int i = 2; i <= n / 2; i++) {
            int first = i;
            int second = n - i;
            int firstCount = 0;
            for (int a = 1; a <= first; a++) {
                if (first % a == 0) {
                    firstCount++;
                }
            }

            int secondCount = 0;
            for (int b = 1; b <= second; b++) {
                if (second % b == 0) {
                    secondCount++;
                }
            }
            if (firstCount == 2 && secondCount == 2) {
                System.out.println(first + "," + second);
            }

        }
    }

}
