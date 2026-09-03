import java.util.Scanner;

public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the Array");

        int size = sc.nextInt();

        int a[] = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int smallest = a[0];
        for(int num : a){
            if(a[0]>num){
                smallest = num;
            }

        }

        System.out.println(smallest+" is the smallesh Number");

    }
}
