import java.util.*;

public class DaemonThread {
    public static void main(String[] args) {
  
  Mythread t = new Mythread();
  //t.setDaemon(true);
  t.start();
  for(int i = 0; i<=10; i++){
    System.out.println("Main thread "+i);
  }
    }
}

class Mythread extends Thread{
  public void run(){
    for(int i = 0; i<=1001; i++){
      System.out.println("Thread 2 "+i);
    }
  }
}