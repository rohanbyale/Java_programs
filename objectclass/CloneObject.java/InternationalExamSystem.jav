import java.util.*;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        // Write your code here
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        int omarks = sc.nextInt();
        sc.nextLine();
        String attempid = sc.nextLine();
        String newName = sc.nextLine();
        int newomarks = sc.nextInt();

        Studentinfo si = new Studentinfo(id,name);
        ExamResult er = new ExamResult(omarks);
        ExamAttempt ea = new ExamAttempt(attempid,si,er);
        System.out.print("Original Exam Attempt");
     
        System.out.println(ea);

        ExamAttempt copied = ea.clone();
        copied.studentinfo.name = newName;
        copied.examresult.omarks = newomarks;
        System.out.println();
        System.out.print("Cloned Exam Attempt");
        System.out.println(copied);
        
    }
}

class Studentinfo implements Cloneable{
    public String id;
    public String name;

    public Studentinfo(String id, String name){
        this.id = id;
        this.name = name;
    }

public String toString(){
    return "\nStudent ID: "+id+"\nStudent Name: "+name;
}
    public Studentinfo clone() throws CloneNotSupportedException{
        return (Studentinfo) super.clone();
    }
}

class ExamResult implements Cloneable{
    public int omarks;
    
    public ExamResult(int omarks){
        this.omarks = omarks;

    }
public String toString(){
    return "\nMarks: "+omarks;
}

public ExamResult clone() throws CloneNotSupportedException{
    return (ExamResult) super.clone();
}

}

class ExamAttempt implements Cloneable{

    public String attempid;
   public Studentinfo studentinfo;
    public ExamResult examresult;

    public ExamAttempt(String attempid, Studentinfo studentinfo, ExamResult examresult){
        this.attempid = attempid;
        this.studentinfo = studentinfo;
        this.examresult = examresult;
    }

public String toString(){
    return "\nAttempt ID: "+attempid+studentinfo+examresult;
}
    public ExamAttempt clone() throws CloneNotSupportedException{
        ExamAttempt copied = (ExamAttempt) super.clone();
        copied.studentinfo = studentinfo.clone();
        copied.examresult = examresult.clone();
        return copied;
    }
}