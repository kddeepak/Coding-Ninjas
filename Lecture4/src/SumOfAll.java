import java.util.Scanner;

public class SumOfAll {
	public static void Sum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		System.out.println(sum);
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
