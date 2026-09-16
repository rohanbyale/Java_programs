import java.util.Scanner;
class CountDigit{
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();


    int a[]= new int[size];

    for(int i = 0; i<=a.length-1; i++){
        a[i]= sc.nextInt();
    }

System.out.print("Digits: ");
    for(int  i = 0 ; i<=a.length-1; i++){
        int num = a[i];
        int temp = Math.abs(num);
        int count = 0;

        if(temp == 0){
            count = 1;
        } else{
            while(temp > 0){
                count++;
                temp /= 10;
            }
        }
        if(i == a.length -1){
        System.out.print(count);
        } else{
            System.out.print(count+", ");
        }
        
    }

}}