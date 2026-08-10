import java.util.Scanner;
public class EvenandOdddigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int evencount = 0;
        int oddcount = 0;
        while(n!=0){
            int ld = n%10;
            if(ld%2==0){
                evencount++;
            }else{
                oddcount++;
            }
            n= n/10;

        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
    
}
