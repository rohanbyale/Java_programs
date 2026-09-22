import java.util.*;

public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        // Write your code here
     
     switch(choice){
        case 1 ->{
            int a = sc.nextInt();
            int b = sc.nextInt();
            multiply(a,b);
        }
        case 2 ->{
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            multiply(a,b,c);
        }
     }
   
    }

    public static void multiply(int a , int b){
        System.out.println(a+" x "+b+" = "+(a*b));
    }

       public static void multiply(int a , int b,int c){
        System.out.println(a+" x "+b+" x "+c+" = "+(a*b*c));
    }

}

