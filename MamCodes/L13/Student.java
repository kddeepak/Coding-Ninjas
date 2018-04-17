package L13;

public class Student {
	
	// Data members
	// non static - belongs to object, different for every object
	String name;
	int rollNumber;
	int age;
	
	// Common properties - belongs to a class, same for all objects
	static int totalStudents;
	static String batchName;
	
	// Default constructor
	/*public Student() {
		System.out.println("Constructor called");
	}*/
	
	// User defined consructors or parameterized constructors
	public Student(int rollNumber) {
		System.out.println("Constructor : " + this);
		this.rollNumber = rollNumber;
	}
	
	public Student(String n, int r) {
		this.name = n;
		rollNumber = r;
	}
	
//	public 
	
	public void displayName() {
		System.out.println(this.name);	// non - static 
	}
	
	
	public static void displayTotalStudents() {
		System.out.println(totalStudents);
//		System.out.println(name);
	}
	
	
	
	
	
	
	
}
