import java.util.Scanner;
public class NeonNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int square = n *n;
       
        int sum = 0;
        while(square !=0){
            int ld = square %10;
            sum = sum+ld;
            square = square/10;

        }
        if(n == sum){
            System.out.println("Neon Number");
        } else{
            System.out.println("Not a Neon Number");
        }
    }
}
