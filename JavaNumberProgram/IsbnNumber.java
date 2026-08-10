import java.util.Scanner;

public class IsbnNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
          int mul = 0;
            int sum = 0;
        for (int i = 1; i <= 10; i++) {
          int a = i;
            while (temp != 0) {
                int ld = temp % 10;
                mul = ld * a;
                sum = sum+mul;
                temp = temp / 10;
            }
          
        }
        System.out.println(sum);
         if(sum %11==0){
            System.out.println("It is isbn Number");
           }else{
            System.out.println("It is not an isbn number");
           }
    }
}
