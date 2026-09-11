import java.util.Scanner;

public class FrequencyofElement {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        for(int i = 0 ; i<=a.length-1; i++){

            int count = 0;
            for(int j = 0; j < i ; j++){
                if(a[i] == a[j]){
                    count++;
                    System.out.println(a[i]+" ,"+ a[j]+" , "+count);
                }
            }
            
        }
    }
    
}
