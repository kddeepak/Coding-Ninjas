import java.util.Scanner;

public class Questionno7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int  r=0;
		int sum=0;
		int c=0;
		while(a!=0)
		{
			r=a%10;
			
			sum=sum*10+r;
			
			a=a/10;
		}
		System.out.println(sum);
	}
}
