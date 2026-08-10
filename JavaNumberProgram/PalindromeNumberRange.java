import java.util.Scanner;

public class PalindromeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter first Number");
        int start= sc.nextInt();
        System.out.println("Enter Second Number");
        int end = sc.nextInt();
        
        if(start <0 || end <0){
            System.out.println("Enter a Valid Range or Number");
            return;
        }
    
        for(int i = start; i<=end;i++){

        int num = i;
        int rev = 0;
        while (num != 0){
            int ld = num%10;
            rev = rev*10+ld;
            num = num/10;

        }
        if(rev == i){
            System.out.println(i);
        }
    }
       



    }
}
