import java.util.Scanner;

public class CheckNumberProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }
        System.out.println("Enter the number");
        int n = sc.nextInt();

        
        boolean found = false;
        for(int e : a){
            if(e ==  n){
                found = true;
                break;
            }
        }

        if(found == true){
            System.out.println("Array contains the given target Element");
        } else{
            System.out.println("Given Elment is not found");
        }
    }

}
