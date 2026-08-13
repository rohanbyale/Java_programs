import java.util.Scanner;

class CheckPalindrome {
    public static void main(String[] args) {
        boolean isPalindrom = checkPalindrom();
        if (isPalindrom) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static boolean checkPalindrom() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        int rev = 0;
        while (num != 0) {
            int ld = num % 10;
            rev = rev * 10 + ld;
            num = num / 10;
        }
        return original == rev;
    }
}