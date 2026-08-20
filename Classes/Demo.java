
class Demo {

    public static int k = 100;
    public int j = 200;

    public static void main(String[] args) {

        System.out.println(A.i);
        A obj = new A();
        System.out.println(obj.m);
    }

}

class A {
    public static int i = 1;
    public int m = 2;

    public static void add() {
        System.out.println("hello");
    }
}
