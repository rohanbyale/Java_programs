import java.util.Scanner;
public class GreatestNumberinDigit{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int max = 0;
        while(n!=0){
         int ld = n%10;
         if(ld > max){
            max = ld;
         }
         n=n/10;
        }
        System.out.println(max);

    }
}