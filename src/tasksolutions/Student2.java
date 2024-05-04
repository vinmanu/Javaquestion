package tasksolutions;

public class Student2 {
	String name;
	int roll_number;
	int phone_number;
	String address;

	public static void main(String[] args) {
		
		Student2 s1=new Student2();
		Student2 s2=new Student2();

	       s1.name="John";

	       s1.roll_number=2;

	       s1.address="john villa";

	      s1.phone_number=12354675;

	       

	       s2.name="Sam";

	       s2.roll_number=3;

	       s2.address="sam villa";

	      s2.phone_number=23133556;

	       

	       System.out.println("Name is "+s1.name+"\nAdress is "+s1.address+"\nroll no is "+s1.roll_number+"\nphone number is "+s1.phone_number);

	       System.out.println("Name is "+s2.name+"\nAdress is "+s2.address+"\nroll no is "+s2.roll_number+"\nphone number is "+s2.phone_number);

	   }

	
	}


