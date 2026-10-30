import java.util.*;

public class ReverStack {
    public static void main(String[] args) {

      Stack <Integer> stack = new Stack<> ();
      stack.push(10);
      stack.push(20);
      stack.push(30);
      stack.push(40);
      stack.push(50);

      Stack <Integer> result = new Stack<>();
   int size = stack.size();
      for(int i = 0; i<=size-1; i++){

        result.push(stack.pop());
      }

      System.out.println(result);
      
    }
}


