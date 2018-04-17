package kd1;

public class box {
	public static  int z=0;
	public int l,b,h;
	public box()
	{
		l=10;
		b=20;
		h=10;
		
	}
	public box(int l,int b,int h)
	{
		this.l=l;
		this.b=b;
		this.h=h;
		
	}
	public static void area(int l,int b,int h)
	{
		System.out.println(l*b*h);
	}
	public void min()
	{
		System.out.println("min");
	}
	/*public static void main(String[] args) {
		box b1 =new box();
		box b2= new box(5,10,15);
		box.z=10;
		
		System.out.format("The value of i is: %d%n", b1.l);
		System.out.print("length:"+b1.l+" ");
		System.out.print("breath:"+b1.b+" ");
		System.out.print("height:"+b1.h+" ");
		System.out.println();
		
		System.out.print("length:"+b2.l+" ");
		System.out.print("breath:"+b2.b+" ");
		System.out.print("height:"+b2.h+" ");
		area(10,20,30);
	}*/
}
