import java.util.Scanner;
public class BuzzNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp = n;
        if(n%7==0|| n%10==7){
            System.out.println("buzz number");
        }else{
          System.out.println("Not a Buzz Number");
        }
        }
    }
