
/*
1) --> final methods cannot be overriden
*/

/*
2) --> IF super class dont want sub-classes to override a method, then superclass
has to declare its method as final.
*/
public class FinalSecond {
    public static void main(String[] args) {
        PQR ob = new PQR();
        ob.run();
    }

}

class MNO {
    final public void run() {
        System.out.println("Run Fast");
    }
}

class PQR extends MNO {
    @Override
    public void run() {
        System.out.println("Run Slow");
    }
}