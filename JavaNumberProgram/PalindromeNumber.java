import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        
        int temp = n;
        int rev = 0;
        while (temp != 0){
            int ld = temp%10;
            rev = rev*10+ld;
            temp = temp/10;

        }
        System.out.println(rev);
        if(n == rev){
System.out.println("Palindrome Number");
        } else{
         System.out.println("Not a Palindron Number");
        }
    }
}
