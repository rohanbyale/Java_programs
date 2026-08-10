import java.util.Scanner;
public class DuckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product=1;

        while(n!=0){
            int ld = n%10;
            product=ld*product;
            n=n/10;

        }
        if(product==0){
            System.out.println("IT is a DUCK number");
        } else{
            System.out.println("Not a duck number");
        }
    }
    
}
