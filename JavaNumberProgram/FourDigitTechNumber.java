import java.util.*;

class FourDigitTechNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int firstHalf = n / 100;
        int secondHalf = n % 100;

        int third = firstHalf + secondHalf;
        double square = Math.pow(third, 2);
        if (square == n) {
            System.out.println(n + " is a Tech Number");
        } else {
            System.out.println(n + " is not a Tech Number");
        }

    }
}