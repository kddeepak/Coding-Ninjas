package L14;

public class Fraction {

	private int numerator;
	private int denominator;
	
	public Fraction(int numerator, int denominator) {
		this.numerator = numerator;
		this.denominator = denominator; 
	}
	
	public void print() {
		System.out.println(numerator + "/" + denominator);
	}
	
	public void simplify() {
		int gcd = getGCD(numerator, denominator);
		numerator /= gcd;
		denominator /= gcd;
	}
	
	private int getGCD(int numerator2, int denominator2) {
		return 0;
	}

	// F1 is passed in this
	public Fraction add(Fraction f2) {
		int lcm = this.denominator * f2.denominator;
		int x = lcm / this.denominator;
		int y = lcm / f2.denominator;
		
		int n = x * this.numerator + y * f2.numerator;
		
		Fraction f3 = new Fraction(n, lcm);
		// Simplify the fraction
		f3.simplify();
		return f3;
	}
	
	
	
	
	
	
	
	
	
	
}
