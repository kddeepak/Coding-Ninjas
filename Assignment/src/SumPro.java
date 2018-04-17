import java.util.Scanner;

public class SumPro {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int in = s.nextInt();
		if (in==1)
		{
		    int i=1;
		    int sum=0;
		    while(i<=a)
		    {
		       sum+=i; 
		       i+=1;
		    }
		    System.out.print(sum);
		}
		else if (in==2)
		{
		    int i=1;
		    int product=1;
		    while(i<=a)
		    {
		       product*=i; 
		       i+=1;
		    }
		    System.out.print(product);
		}
		else
		{
		   System.out.print("-1"); 
		}
	}

}
