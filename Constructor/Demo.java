
class Demo {

    public static void main(String[] args) {
        String s = "rohan";
        String a = "byale";
        A obj = new A();
        obj.A(s, a);
        obj.A(s);
    }

}

class A {
    public void A(String s) {
        System.out.println("hello");
    }

    public void A(String s, String a) {
        System.out.println("hello world");
    }
}