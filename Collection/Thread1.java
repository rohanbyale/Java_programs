package Collection;

import java.util.*;

public class Thread1 {
    public static void main(String[] args) throws Exception {
        Vector<Integer> v = new Vector<>();

        Thread t = new Thread(() -> {
           try{
             for (int i = 0; i <= 10; i++) {
                v.add(i);
                Thread.sleep(500);
            }
           }catch(InterruptedException e){
            System.out.println(e);
           }
        });

        
        Thread t1 = new Thread(() -> {
            try{
             for (int i = 11; i <= 20; i++) {
                v.add(i);
                Thread.sleep(500);
            }
           }catch(InterruptedException e){
            System.out.println(e);
           }
        });

    
        Thread t2 = new Thread(() -> {
            try{
             for (int i = 21; i <= 30; i++) {
                v.add(i);
                Thread.sleep(500);
            }
           }catch(InterruptedException e){
            System.out.println(e);
           }
        });

           Thread t3 = new Thread(() -> {
            try{
             for (int i = 31; i <= 40; i++) {
                v.add(i);
                Thread.sleep(500);
            }
           }catch(InterruptedException e){
            System.out.println(e);
           }
        });


        t.start();  
        t.join(); 
        t1.start();
        t1.join();  
        t2.start();
        t2.join();
        t3.start();
        t3.join();


        System.out.println(v);
    }
}
