package L14;

public class Main {
	
	public static void test(ClassA a) {
		
	}
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.fun1();
		
		
		
		
		
		
		
		
		
		
		
		
		View v[] = new View[6];
		int i = 0;
//		for(i = 0; i < 3; i++) {
//			v[i] = new TextBox();
//		}
		for(;i < 6; i++) {
			v[i] = new RadioButton();
		}
		
		for(int j = 0; j < 6; j++) {
			v[i].display();
		}
		
		
//		ClassC c = new ClassC(12, 3, 4);
		
//		ClassA a = new ClassA(12);
		
//		ClassA a1 = new ClassB(2, 3);
		
//		test(c);
		
	}
}
