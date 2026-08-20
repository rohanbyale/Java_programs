
/**
 * Noreturn
 */
import java.util.Scanner;

public class Noreturn {

    public int add(int a, int b) {

        return a * b;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Noreturn obj = new Noreturn();
        System.out.println(obj.add(a, b));
    }

}