import java.util.*;

class ArmstrongNumbersinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        if (size < 0) {
            System.out.println("Invalid Array size.");
            return;
        }
        int a[] = new int[size];
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
        boolean isPresent = false;
        for (int i = 0; i <= a.length - 1; i++) {

            int count = 0;
            int num = a[i];
            int temp = num;
            while (temp != 0) {
                int ld = temp % 10;
                count++;
                temp = temp / 10;
            }

            temp = num;

            int sum = 0;
            while (temp != 0) {
                int product = 1;
                int ld = temp % 10;

                for (int j = 1; j <= count; j++) {
                    product = product * ld;

                }
                sum += product;
                temp = temp / 10;
            }

            if (sum == num) {
                isPresent = true;
                System.out.print(a[i] + " ");
            }
        }
        if (isPresent == false) {
            System.out.println("No Armstrong Numbers Found.");
        }

    }
}
