package L14;

public class Fractionuse {

	public static void main(String[] args) {
		Fraction f1 = new Fraction(10, 30);
		Fraction f2 = new Fraction(5, 4);
		Fraction f3 = f1.add(f2);
		f3.print();
	}
}
