import java.util.Arrays;
import java.util.Scanner;

public class FirstReapetingNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();
        }

        boolean found = false;

        for (int i = 0; i <= a.length - 1; i++) {

            for (int j = 0; j < i; j++) {
                if (a[i] == a[j]) {
                    System.out.println("First Repeating Number is : " + a[i]);
                    found = true;
                    break;
                    
                }

            }

            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not reapeating ");
        }

    // for(int i = 0; i<=a.length-1; i++){

    //     for(int j = 0; j < i ; j++){
            
    //         if(a[i] == a[j]){
    //             found = true;
    //             break;
    //         }
    //     }

    //     if(found){
    //         System.out.println("First Reatpeated Element is "+a[i]);
    //     }
    // }

    // if(!found){
    //     System.out.println("No Element is Reapeting");
    // }

    }

}
