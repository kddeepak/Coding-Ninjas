import java.util.Scanner;
public class BintoDec {
	public static void main(String[] args) {
		// Write your code here
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int r=0;
		double count=0.0;
		int sum=0;
		while(a!=0)
		{
		    r=a%10;
		    sum+=(Math.pow(2.0, count))*r;
		    a=a/10;
		    count+=1;
		}
		System.out.println((int)(sum));

	}
}
