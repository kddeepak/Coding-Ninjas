package L15;

public class Student implements CompareInterface<Student>{
	int marks;
	String name;
	
	public boolean isGreater(Student x) {
		return this.marks > x.marks;
	}
	
}
