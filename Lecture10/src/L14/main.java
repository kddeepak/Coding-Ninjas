package L14;

import java.util.Scanner;

public class main {

	public static void Printer(int n,int ans,int counter)
	{
		if(ans==n-1)
		{
			System.out.println(ans);
			return;
		}
		
		
		
		if(ans<=n)
		{
			System.out.println(ans);
			Printer(n,ans*10,counter);
		}
		if(ans>n)
		{
			ans=ans/10;
			if(counter==10)
			{
				System.out.println(ans/10+1);
			}
			else
			{
				
			}
			Printer(n,ans+1,counter+1);
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		Printer(a,1,0);
	}
}
