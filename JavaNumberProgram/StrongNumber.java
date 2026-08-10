
import java.util.Scanner;
public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
         int original = n;
         int sum = 0;
    while(n != 0){

        int ld = n%10;
        int factorial = 1;
        for(int i = 1; i<= ld;i++){
            factorial= factorial*i;
        }
        sum = sum+factorial;
n= n/10;
        
    }   
    if(sum==original){
        System.out.println("The given number is strong number");
    } else{
        System.out.println("not a strong number");
    } 
    }
    
}
