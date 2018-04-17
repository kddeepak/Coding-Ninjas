import java.util.Scanner;

public class Question4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int r;
		int sum1=0,sum2=0;
		while(a!=0)
		{
			r=a%10;
			if (r%2==0)
			{
				sum1+=r;
			}
			else
			{
				sum2+=r;
			}
			a=a/10;
			
			
		}
		System.out.println("even digit sum:"+sum1);
		System.out.println("odd digit sum:"+sum2);
	}

}
