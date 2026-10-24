import java.util.*;

public class RemoveDupliate {
  public static void main(String[] args) {
    Vector<Integer> v = new Vector();
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(3);
    v.add(2);

    Vector<Integer> v2 = new Vector();
    v.add(2);
    v.add(3);
    v.add(4);
    v.add(3);
    v.add(2);

    v2.addAll(v);
    System.out.println(v2);

    Vector<Integer> result = new Vector();

    for (Integer e : v2) {
      if (!result.contains(e)) {
        result.add(e);
      }
    }

    System.out.println(result);

  }
}