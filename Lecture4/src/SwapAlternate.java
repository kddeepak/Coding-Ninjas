import java.util.Scanner;

public class SwapAlternate {
	public static void Swap(int a[])
	{
		int l;
		if(a.length%2==0)
			l=a.length-1;
		else
			l=a.length-2;
				
			
		for(int i=0;i<l;i+=2)
		{
			int temp=a[i];
			a[i]=a[i+1];
			a[i+1]=temp;
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
		int input[] =takeInput();
		Swap(input);
		
		printArray(input);
		
	}
}
