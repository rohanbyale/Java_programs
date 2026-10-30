
import java.util.*;

public class RotateByleft {
    public static void main(String[] args) {

        Vector<Integer> v = new Vector<>();

        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);

        for (int k = 1; k <= 2; k++) {
            int temp = v.get(v.size() - 1);

            for (int i = v.size() - 1; i > 0; i--) {
                v.set(i, v.get(i - 1));
            }

            v.set(0, temp);
        }

        System.out.println(v);
    }
}
