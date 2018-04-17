import java.util.Scanner;

public class ArrayRotate {
	public static void rotate(int[] arr, int d) {
		int copy[]=new int[arr.length];
		int l=arr.length;
		for(int i=0;i< arr.length;i++)
		{
			int loc=((i-d+l)%(l));
		    copy[loc]=arr[i];
		}
		for(int i=0;i< arr.length;i++)
		{
			arr[i]=copy[i];
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
		Scanner s = new Scanner(System.in);
		
		int b[] =takeInput();
		int d =s.nextInt();
		
		rotate(b,d);
		printArray(b);
		
	}
}
