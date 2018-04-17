import java.util.Scanner;

public class PushZero {
	public static void pushZerosAtEnd(int[] arr)
	{
		int start=0;
		int end =arr.length-1;
		int copy[] = new int[end+1];
		int j=0;
		for(int i=0;i<=end;i++)
		{
			
			if(arr[i]==0)
				continue;
			else
			{
				arr[j]=arr[i];
				j+=1;
			}
		}
		while(j<=end)
		{
			arr[j]=0;
			j+=1;
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
		
		pushZerosAtEnd(b);
		printArray(b);
		
	}
}
