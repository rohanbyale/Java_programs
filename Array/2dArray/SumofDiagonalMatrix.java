import java.util.Scanner;
class SumofDiagonalMatrix{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int outersize = sc.nextInt();
  
        int a[][] = new int[outersize][outersize];

int sum1 = 0;
int sum2 = 0;
        for(int i = 0; i<=a.length-1; i++){
            for(int j = 0; j<=a.length-1; j++){
                a[i][j] = sc.nextInt();

                if(i == j){
                    sum1 = sum1+a[i][j];
            
                }
                if(i+j== outersize-1){
                    sum2 = sum2+a[i][j];
                }
            }
        }

        System.out.println("Principal Diagonal Sum = "+sum1);
        System.out.println("Secondary Diagonal Sum = "+sum2);
    }
}