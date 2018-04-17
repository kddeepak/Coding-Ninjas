import java.util.Scanner;

public class ArrangeInArray {
	public static int[] Arrange(int n)
	{
		int temp=1;
		int end=n-1;
		int start=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			if((temp)%2==0)
			{
				a[end]=temp;
				end-=1;
			}
			else
			{
				
				a[start]=temp;
				start+=1;
			}
			temp+=1;
		}
		return a;
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
		int n = s.nextInt();
		
		int b[]=Arrange(n);
		
		printArray(b);
		
	}
}
