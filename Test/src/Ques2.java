import java.util.Scanner;

public class Ques2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int l=(a*2)+1;
		int i=1;
		while(i<=a)
		{
			int j=1;
			while(j<=a)
			{
				if(j==i)
					System.out.print("*");
				else
					System.out.print("0");
				j+=1;	
			}
			j=1;
			System.out.print("*");
			while(j<=a)
			{
				if(j==(a-i+1))
					System.out.print("*");
				else
					System.out.print("0");
				j+=1;
			}
			System.out.print("\n");
			i+=1;
		}
	}

}
