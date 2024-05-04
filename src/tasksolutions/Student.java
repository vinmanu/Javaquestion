package tasksolutions;

public class Student {
	 String name;
	  int roll_no;
	  
	  public static void main(String[] args) {
	    Student student = new Student();
	    student.roll_no = 2;
	    student.name = "John";
	    System.out.println("Studnt name is:"+student.name);
	    System.out.println("Student roll number is:"+student.roll_no);
	  }
	}