import java.util.Scanner;

public class NthLargestinArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter size of the Array");
    int size = sc.nextInt();

    int a[] = new int[size];

    System.out.println("Enter the array elements one by one");
    for (int i = 0; i < a.length; i++) {
      a[i] = sc.nextInt();
    }
    System.out.println("Enter the number ");
    int n = sc.nextInt();

    for (int i = 0; i < a.length; i++) {

      int count = 0;

      for (int j = 0; j < a.length; j++) {
        if (a[j] > a[i]) {
          count++;
        }
      }
      if (count == (n - 1)) {
        System.out.println("Nth Largest Number is  : " + a[i]);
        break;
      }

    }
  }

}
