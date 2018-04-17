import java.util.Scanner;

public class Merge {
	public static void mergeSort(int[] input){
		
		int a[]=new int[(input.length)/2];
		int b[]=new int[(input.length)-((input.length)/2)];
		for(int i =0;i<=(input.length-1)/2;i++)
		{
		    a[i]=input[i];
		}
		int count=0;
		for(int i=((input.length)/2);i<=input.length-1;i++)
		{
		    b[count]=input[i];
		    count+=1;
		}
		printArray(a);
		System.out.print("\n");
		printArray(b);
		
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
		mergeSort(input);
		
		
		
	}

}
