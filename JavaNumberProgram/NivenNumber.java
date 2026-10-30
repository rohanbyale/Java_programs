
import java.util.*;

class Main {
    public static void NivenNumber(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;

        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += ld;
            n = n / 10;
        }

        if (temp % sum == 0) {
            System.out.println(temp + " is a Niven Number.");
        } else {
            System.out.println(temp + " is not a Niven Number.");
        }

    }
}
