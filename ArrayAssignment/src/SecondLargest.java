import java.util.Scanner;

public class SecondLargest {
	public static int secondLargestElement(int[] arr)
	{
		int temp1=0;
		int temp2=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>temp1)
				temp1=arr[i];
			if(temp2>)
		}
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
		
		
		int z=secondLargestElement(b);
		System.out.println(z);
		
	}
}
