import java.util.Scanner;
/**
 * Automorphic
 */
public class SunnyNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       int root = (int) Math.sqrt(n+1);
      if(root*root == n+1){
        System.out.println("Sunny Number");
      }else{
        System.out.println("Not a sunny number");
      }
    }
}