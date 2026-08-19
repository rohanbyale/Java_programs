import java.util.Scanner ;


public class CircleArea {
    public static  double findArea(int redius){
        return 3.14 * redius * redius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int redius = sc.nextInt();
        System.out.println(findArea(redius));
    }
}
