import java.util.Scanner;

public class CheckArray {
	public static int arrayRotateCheck(int[] arr)
	{
		int temp=Integer.MAX_VALUE;
		int loc=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<temp)
			{
				loc=i;
				temp=arr[i];
			}
		}
		return loc; 
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
		
		
		int z=arrayRotateCheck(b);
		System.out.println(z);
		
	}
}
