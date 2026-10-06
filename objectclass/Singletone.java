import java.util.*;

public class Main {
    public static void main(String[] args) {
    
      Student s1 = Student.GivemeanObject(10,20);
      System.out.println(s1);
    }
}

class Student{
  private int i ;
  private int j;
  private static Student singletenObject = null;
  public static Student GivemeanObject(int i, int j){
    if(singletenObject == null){
      singletenObject = new Student(i,j);
    }
    return singletenObject;
  }

  private Student(int i , int j){
    this.i = i;
    this.j = j;
  }

  public String toString(){
    return "i value = "+i+"j value = "+j;
  }
}