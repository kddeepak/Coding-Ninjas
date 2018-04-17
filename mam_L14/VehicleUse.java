package L14;

public class VehicleUse {

	public static void test(Vehicle v) {
		
	}
	
	public static void main(String[] args) {
		
		// c can access all the properties of car & vehicle both
		Car c = new Car();
		
		// v1 can access only vehicle properties
		Vehicle v1 = new Vehicle();
		
		// v2 can access only vehicle properties
		Vehicle v2 = new Car();
		v2.display(); 	// Car's display will be called
		
		
		
		
		c.display();	// Car
		v1.display();	// Vehicle
		v2.display(); 	// Car
		
		test(v1);
		test(c);
		
		/*Vehicle v = new Vehicle();
		v.modelNumber = 101;
		v.numOftyres = 4;*/
		
		// Vehicle default constructor is called
		/*Car c = new Car("ehite", 6);		
		
		c.color = "White";
		c.modelNumber = 200;
		c.numOftyres = 4;
		
		c.display();*/
	}
}
