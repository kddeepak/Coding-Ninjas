package L14;

public class Car extends Vehicle {
	String color;
	
	Car() {
		System.out.println("Car");
	}
	
	Car(String s, int n) {
		super(n);
		color = s;
		System.out.println("Car");
	}
	
	// Function overriding
	public void display() {
		System.out.println("Car display");
	}
}
