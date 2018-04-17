import java.util.Scanner;

public class EvenOddSum {
	public static void Sum(int a[])
	{
		int sum1=0;
		int sum2=0;
		for(int i=0;i<a.length;i++)
		{
			if(i%2==0)
				sum1+=a[i];
			else
				sum2+=a[i];
		}
		System.out.println(sum1-sum2);
	}
	public static void printArray(int input[])
	{
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	public static int[] takeInput(){//fuction return integer array
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
		{
			//System.out.println(b[5]);//going out of range.
			input[i]=s.nextInt();
			//System.out.println(input[i]);
		}
		return input;
	}
	public static void main(String[] args) {
		int input[] =takeInput();
		Sum(input);
		//printArray(input);
		
	}
}
