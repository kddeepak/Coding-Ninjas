import java.util.Scanner;

public class SelectionSort {
	public static void selectionSort(int[] arr)
	{
		int start=0;
		
		int end =arr.length-1;
		while(start<end)
		{
			int loc =start;
			int temp;
			int min=arr[start];
			int i=start+1;
			while(i<=end)
			{
				if(arr[i]<min)
				{
					min=arr[i];
					loc=i;
				}
				i+=1;
			}
			temp=arr[start];
			arr[start]=arr[loc];
			arr[loc]=temp;
			
			start+=1;
			
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
		
		selectionSort(b);
		printArray(b);
		
	}
}
