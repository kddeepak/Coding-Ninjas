import java.util.Scanner;

public class Arrowpattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i=1;
		int l=(a/2)+1;
		int nex=a-l;
		while(i<=l)
		{
			int j=1;
			while(j<i)
			{
				System.out.print(" ");
				j+=1;
			}
			j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j+=1;
			}
			i+=1;
			System.out.print("\n");
		}
		i=nex;
		while(i>=1)
		{
			int j=1;
			while(j<i)
			{
				System.out.print(" ");
				j+=1;
			}
			j=1;
			while(j<=i)
			{
				System.out.print("* ");
				j+=1;
			}
			i-=1;
			System.out.print("\n");
		}
		
		
	}

}
