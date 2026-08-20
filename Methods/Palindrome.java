
import java.util.Scanner;

public class Palindrome {

    public boolean checkPalindrome(int a) {

        int original = a;
        int reverse = 0;
        while (a != 0) { 
            int ld = a % 10;
            reverse = reverse * 10 + ld;
            a = a / 10;

        }

        return original == reverse;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Palindrome obj = new Palindrome();
        System.out.println(obj.checkPalindrome(a));
    }
}
