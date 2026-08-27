import java.util.Scanner;
/**
 * Main
 */
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int sum = 0;
        for(int i = 1; i<= n; i++){
            System.out.println(sum);
            a = b;
            b = sum;
            sum = (a+b);
            
        }

    }
}

// class Solution {
//     public int fib(int n) {
//        if(n == 0 || n ==1 ){
//         return n;
//        }
//        return fib(n-1)+ fib(n-2);
//     }
// }