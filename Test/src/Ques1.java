import java.util.Scanner;

public class Ques1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i=1;
		while(i<=a)
		{
			int j=a;
			int temp =a;
			while(j>=1)
			{
				if(j==i)
					System.out.print("*");
				else
					System.out.print(j);
				j-=1;
			}
			i+=1;
			System.out.print("\n");
			
		}
	}

}
