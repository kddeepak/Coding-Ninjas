import java.util.Scanner;

public class ArrayRecursion {
	public static boolean isSorted(int input[])
	{
		if(input.length==1)
		{
			return true;
		}
		if(input[0]>input[1])
		{
			return false;
		}
		int smallInput[]=new int[input.length-1];
		for(int i=1;i<input.length;i++)
		{
			smallInput[i-1]=input[i];
		}
		boolean ans=isSorted(smallInput);//isSorted(input,start+1);7
		return ans;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input[]=new int[5];
		for(int i=1;i<input.length;i++)
		{
			input[i]=s.nextInt();
		}
		
		boolean ans=isSorted(input);
		System.out.println(ans);
	}

}
