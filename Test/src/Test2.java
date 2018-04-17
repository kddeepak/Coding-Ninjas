import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int l=(a*2)+1;
		int i=1;
		while(i<=a)
		{
			int j=1;
			while(j<i)
			{
				System.out.print("0");
				j+=1;
			}
			int k=a-i;
			
			int count=0;
			int count2=0;
			while(j<=l)
			{
				if(j==(i+count*(k+1)) && count2<3 )
				{
					System.out.print("*");
					count+=1;
					count2+=1;
				}
				else
					System.out.print("0");
				
				j+=1;
			}
			System.out.print("\n");
			i+=1;
			
		}
		
	}

}
