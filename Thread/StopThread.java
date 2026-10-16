import java.util.*;

public class StopThread {
    public static void main(String[] args) {
   
   Mythread t = new Mythread();
   t.start();
    }
}

class Mythread extends Thread{
  public void run(){
    for(int i = 0; i<=10; i++){
      System.out.println(i);
      if(i==5){
        return;
      }
    }
  }
}