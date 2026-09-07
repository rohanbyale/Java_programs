import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 2; i++) {

            a[i] = sc.nextInt();

        }
        boolean asc = true;
        for(int i  = 0; i<=a.length-2; i++){
            if(a[i+1]<a[i]){
                asc = false;
            break;
            }
          
        }
        if(asc){
            System.out.println("Array is sorted");
        } else{
            System.out.println("array is not sorted");
        }
        
    }
   
}
