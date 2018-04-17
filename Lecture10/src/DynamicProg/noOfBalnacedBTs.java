package DynamicProg;

public class noOfBalnacedBTs {
	public static int Balanced(int h)
	{
		int a[] =new int[h+1];
		a[2]=2;
		a[1]=1;
		return Balanced(h,a);
	}
	public static int Balanced(int h,int[] a)
	{
		if(h<=2)
			return a[h];
		for(int i=3;i<=h;i++)
			
		{
			int x=a[i-1];
			
			int y=a[i-2];
			a[i]=x*x+2*x*y;
		}
		return a[h];
		
	/*	if(h<=1)
			return a[h];
		if(a[h-1]==0)
		{
			a[h-1]=Balanced(h-1,a);
		}
		if(a[h-2]==0)
		{
			a[h-2]=Balanced(h-2,a);
		}
		a[h]=a[h-1]*a[h-1]+2*a[h-1]*a[h-2];
		return a[h];*/
	}
	public static void main(String[] args) {
		int x = Balanced(3);
		System.out.println(x);
	}
}
