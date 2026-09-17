import java.util.Scanner;

public class FrequencyOfArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();

        int[] a = new int[size];
        System.out.println("Enter array element one by one");

        for (int i = 0; i <= a.length - 1; i++) {

            a[i] = sc.nextInt();

        }

        for (int i = 0; i <= a.length - 1; i++) {

            boolean isPreviouslyPresent = true;

            for (int j = 0; j <= i - 1; j++) {
                if (a[j] == a[i]) {
                    isPreviouslyPresent = false;
                    break;
                }
            }

            if (isPreviouslyPresent == false) {
                int count = 0;
                for (int j = 0; j <= a.length - 1; j++) {
                    if (a[j] == a[i]) {
                        count++;
                    }
                }
                System.out.println(a[i] + " is repeated " + count + " time(s)");
            }
        }
    }

}

/*
 * import java.util.Scanner;
 * class Main{
 * public static void main(String[]args){
 * Scanner sc = new Scanner(System.in);
 * 
 * int size = sc.nextInt();
 * if(size < 0 ){
 * System.out.println("Invalid Array Size");
 * return;
 * }
 * int a[]= new int[size];
 * 
 * 
 * for(int i = 0; i<=a.length-1; i++){
 * a[i] = sc.nextInt();
 * }
 * 
 * for(int i = 0; i<=a.length-1; i++){
 * 
 * boolean isPreviouslyPresent = false;
 * 
 * for(int j = 0; j < i; j++){
 * if(a[i]== a[j]){
 * isPreviouslyPresent= true;
 * break;
 * }
 * }
 * 
 * if(isPreviouslyPresent == false){
 * int count = 0;
 * for(int j = 0; j<=a.length-1; j++)
 * {
 * if(a[i] == a[j]){
 * count++;
 * }
 * }
 * System.out.println("Element: "+a[i]+", "+"Frequency: "+count);
 * 
 * }
 * }
 * 
 * }
 * }
 * 
 */