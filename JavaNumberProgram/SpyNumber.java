import java.util.Scanner;

public class SpyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int product = 1;
        while(n!=0){
            int ld = n%10;
            sum = sum+ld;
            product = ld*product;
            n= n/10;

        }
        if(sum==product){
            System.out.println("The given Number is spy number");
        }else{
            System.out.println("The given Number is not a spy number");
        }
    }
}
