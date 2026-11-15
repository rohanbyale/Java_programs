package ClasssTypes;

public class SingletonClass {
	public static void main(String[]args) {
		
		Student s1 = Student.givemeObject(10, "Rohan");
		System.out.println(s1);
		
	}

}

class Student{
	private int rollno;
	private String name;
	
	private static Student obj = null;
	
	public static Student givemeObject(int rollno, String name) {
		if(obj == null) {
			obj = new Student(rollno,name);
		}
		return obj;
	}
	
	private Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
	}



	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}
	
	
}