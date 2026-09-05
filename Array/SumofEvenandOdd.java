import java.util.Arrays;
import java.util.Scanner;

public class SumofEvenandOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }
int evensum = 0;
int oddsum = 0;

   for(int num : a){
  if(num % 2 == 0){
    evensum += num;
  } else{
    oddsum += num;
  }
   }

  System.out.println("Sum of Even Number : "+evensum);
  System.out.println("Sum of Odd Number : "+oddsum);
    }

}
