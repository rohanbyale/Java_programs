import java.util.Arrays;
import java.util.Scanner;

public class RightRotatebyK {
 public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");

        int size = sc.nextInt();
        int a[] = new int[size];
        System.out.println("Enter array element one by one  : ");
        for (int i = 0; i <= a.length - 1; i++) {
            a[i] = sc.nextInt();
        }
System.out.println("Enter a element to Rotate array left");
        int k = sc.nextInt();

        for(int j = 1; j<= k; j++){
            int temp = a[a.length-1];
            for(int i = a.length-2; i>=0; i--){
                a[i+1]= a[i];
            }
            a[0] = temp;
        }
        System.out.println("Array after left Rotation : "+Arrays.toString(a));

 }   
}
