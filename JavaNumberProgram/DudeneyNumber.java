import java.util.*;

class DudeneyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Number must be positive.");
            return;
        }

        int temp = n;
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum += ld;
            n = n / 10;
        }

        double cubeRoot = Math.pow(sum, 3);
        if (cubeRoot == temp) {
            System.out.println(temp + " is a Dudeney number.");
        } else {
            System.out.println(temp + " is not a Dudeney number.");
        }
    }
}