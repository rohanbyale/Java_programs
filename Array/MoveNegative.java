import java.util.Arrays;
import java.util.Scanner;

public class MoveNegative {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size");

        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0; i<=a.length-1;i++){
            a[i] = sc.nextInt();
        }

        int j = 0;
        for(int i = 0; i<=a.length-1; i++){
            if(a[i] <0){
                int temp = a[i];
                a[i]=a[j];
                a[j] = temp;
                j++;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    
}
