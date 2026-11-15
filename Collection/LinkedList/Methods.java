import java.util.*;

public class Methods {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int size = sc.nextInt();
       LinkedList<String> tasks = new LinkedList<String>();
       for(int i = 1; i<=size; i++){
        tasks.add(sc.next());
       }
       String first = sc.next();
       String last = sc.next();
       addTaskAtBeginning(tasks,first);
          addTaskAtEnd(tasks,last);
       System.out.println("Tasks after adding: "+tasks);
       System.out.println("Next task: "+viewNextTask(tasks));
       processNextTask(tasks);
       System.out.println("Final tasks: "+tasks);
        
    }

    public static void addTaskAtBeginning(LinkedList<String> tasks, String task){
        tasks.addFirst(task);
    }

    public static void addTaskAtEnd(LinkedList<String> tasks, String task){
        tasks.add(task);
    }

    public static String viewNextTask(LinkedList<String> tasks){
        return tasks.getFirst();
    }

    public static void processNextTask(LinkedList<String> tasks){
       System.out.println("Processed task: "+tasks.pollFirst());
    }



}
