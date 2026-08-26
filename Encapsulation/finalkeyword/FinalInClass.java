
/*
 final keyword with class

 1) --> if a class declared as final, we cannot inherit the class 
*/
public class FinalInClass { 
    public static void main(String[] args) { 
        ABC ob = new ABC(); 
        ob.run(); 
    } 
} 

final class XYZ { 
    public void run() { 
        System.out.println("Run Slow"); 
    } 
} 

class ABC extends XYZ { 
    public void run() { 
        System.out.println("Run Fast"); 
    } 
}
