import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter A Given String Rotaion");
        String s1 = sc.nextLine();

        System.out.println("Enter a string");
        String s2 = sc.nextLine();

        String s3 = s1 + s2;
        if (s3.contains(s2)) {
            System.out.println("It contains given String Rotation");
        } else {
            System.out.println("It can not contains given String Rotation");
        }

    }
}