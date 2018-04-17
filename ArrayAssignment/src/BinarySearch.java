import java.util.Scanner;

public class BinarySearch {
	public static int binarySearch(int[] arr, int num)
	{
		int start=0;
		int end =arr.length-1;
		
		while(start<=end)
		{
			int mid = (start+end)/2;
			if(arr[mid]==num)
			{
				return mid;
			}
			
			else if(num>arr[mid])
			{
				start=mid+1;
			}
			else
			{
				end=mid-1;
			}
		}
		return -1;
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
		int num = s.nextInt();
		int z=binarySearch(b,num);
		System.out.println(z);
		
	}
}
