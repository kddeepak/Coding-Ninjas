import java.util.Scanner;

public class Sort012 {
	public static void sort012(int[] arr)
	{
		int temp1=0;
		int temp2=0;
		int temp3=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
				temp1+=1;
			else if(arr[i]==1)
				temp2+=1;
			else if(arr[i]==2)
				temp3+=1;
		}
		for(int i=0;i<temp1;i++)
		{
			arr[i]=0;
		}
		for(int i=0;i<temp2;i++)
		{
			arr[i+temp1]=1;
		}
		for(int i=0;i<temp3;i++)
		{
			arr[i+temp1+temp2]=2;
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
		
		
		sort012(b);
		printArray(b);
		
	}
}
