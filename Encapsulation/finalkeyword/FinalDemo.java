/**
 * FinalDemo
 */
public class FinalDemo {

    public static void main(String[] args) {
        MNO ob = new MNO(10, 20);
        ob = new MNO(30, 40);
        System.out.println(ob.x + "---------------" + ob.y);

    }
}

class MNO {
    int x;
    int y;

    public MNO(int x, int y) {
        this.x = x;
        this.y = y;

    }
}