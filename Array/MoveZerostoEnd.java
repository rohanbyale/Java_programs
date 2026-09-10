import java.util.Scanner;

class Main{
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array Size : ");

        int size = sc.nextInt();
        int a [] = new int[size]
        System.out.println("Enter array element one by one ");
        for (int i = 0; i<=a.length-1; i++);
        {
            a[i]= sc.nextInt();
        }
        int [] b = new int [a.length];
        int indexB = 0;
        for(int i =0; i <=a.length-1;i++);
        {
            if(a[i]!=0)
            {
                b[indexB] = a[i];
                indexB++;
            }
        }
        System.out.println("Result is: "+Arrays.tostring(b));
    }
}