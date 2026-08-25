/**
 * CopyConstructor
 */
public class CopyConstructor {

    public static void main(String[] args) {
         A obj = new A(10,20);
         A obj1 = new A(obj);
         System.out.println(obj1.a);
        
    }
}

  class A {

 public int  a = 100;
 public int  b = 200;

 public A(int a, int b){
    this.a = a;
    this.b = b;

 }

public A(A ob) {
    this.a = ob.a;
    this.b = ob.b;
}

}