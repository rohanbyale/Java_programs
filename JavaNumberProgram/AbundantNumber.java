import java.util.*;
class AbundantNumber{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input. Enter a positive integer.");
            return;
        }
        
        int sum = 0;
        for(int i = 1; i<n; i++){
            if(n%i==0)sum+=i;
        }
       if(sum>n){
        System.out.println(n+"Abundant Number.");
       }else{
        System.out.println(n+" is not an Abundant Number.");
       }
    }
}