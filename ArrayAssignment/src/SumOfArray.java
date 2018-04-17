import java.util.Scanner;

public class SumOfArray {
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2)
	{
		
		
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
		
		
		int b[] =takeInput();
		
		
		sort012(b);
		printArray(b);
		
	}
}
