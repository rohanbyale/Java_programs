import java.util.*;

public class StudentInfo {
    public static void main(String[] args) {
      Student std = new Student(101,"Rohan","Java FullStack");
      StudentDetails s = new StudentDetails(std);
      CourseDetails c = new CourseDetails(std);
      s.start();
      c.start();
    }
}

class Student{
  public int sid;
  public String name;
  public String course;

  public Student(int sid,String name,String course){
    this.sid = sid;
    this.name = name;
    this.course = course;
  }
}

class StudentDetails extends Thread{
  public Student s;
  public StudentDetails(Student s){
    this.s = s;
  }

  public void run(){
    System.out.println("Student ID: "+s.sid);
    System.out.println("Student Name: "+s.name);
  }
}

class CourseDetails extends Thread{
  public Student s;
  public CourseDetails(Student s){
    this.s = s;
  }

  public void run(){
    System.out.println("Course Name: "+s.course);
  }
}

