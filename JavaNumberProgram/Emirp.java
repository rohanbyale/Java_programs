import java.util.Scanner;

public class Emirp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        int original = n;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        int secondcount = 0;
        int rev = 0;
      int temp = original;
        while (temp != 0) {
            int ld = temp % 10;
            rev = rev * 10 + ld;
            temp = temp / 10;

        }
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0) {
                secondcount++;
            }
        }
        if (count == 2 && secondcount == 2) {
            System.out.println("Emirp");
        } else {
            System.out.println("Not emirp");
        }
    }
}
