package L14;

public class FractionClass {
	private int numerator;
	private int denominator;
	public FractionClass(int numerator,int denominator)
	{
		this.numerator=numerator;
		this.denominator=denominator;
	}
	
	public void print()
	{
		System.out.println(numerator+"/"+denominator);
	}
	public FractionClass add(FractionClass f2)
	{
		int lcm =this.denominator*f2.denominator;
		int x=lcm / this.denominator;
		int y=lcm / f2.denominator;
		
		int n=x*this.numerator+y*f2.numerator;
		FractionClass f3=new FractionClass(n,lcm);
		//Simplify farction..
		
		return f3;
	}
	
}
