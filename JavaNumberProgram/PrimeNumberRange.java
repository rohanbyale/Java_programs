
import java.util.Scanner;
public class PrimeNumberRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    System.out.println("Enter First Number ");
    int start = sc.nextInt();
    System.out.println("Enter Last Number");
    int end = sc.nextInt();
int a = 0;
for(int i = start; i<=end;i++){
    int count = 0;
    for(int j= 1; j<=i;j++){
        if(i%j==0){
            count++;
           
        }
    }
 
    if(count==2){
        System.out.println(i);
        // printing how many prime numbers are there in given range
        a++;
    }
}
System.out.println(a);

    }
}
