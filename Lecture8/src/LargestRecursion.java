import java.util.Scanner;

public class LargestRecursion {
	public static int largest(int a[],int start)
	{
		if(start==a.length)
		{
			int temp=0;
			return temp;
		}
		int f=largest(a,start+1);
		if(a[start]>f)
		{
			f=a[start];
		}
		return f;
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
		int z=largest(input,0);
		System.out.println(z);
		
		
	}
}
