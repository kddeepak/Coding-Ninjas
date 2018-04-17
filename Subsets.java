import java.util.Scanner;

public class Subsets {
	public static void printarray(int input[][])
	{
		
		for(int i=0;i<input.length;i++)
		{
			for(int j=0;j<input[0].length;j++)
				System.out.print(input[i]+" ");
		}
	}
	public static int[] input()
	{
		Scanner s= new Scanner(System.in);
		int a=s.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++)
		{
			arr[i]=s.nextInt();
		}
		return arr;
	}
	public static int[][] subsets(int input[]) {
		// Write your code here
		if(input.length==0)
		{
		    int temp[][]={{}};
		    //temp[0][0]=input[0];
		    
		    return temp;
		}
		int te[]=new int[input.length-1];
		for(int i=0;i<te.length;i++)
		{
		    te[i]=input[i+1];
		}
        int temp[][]=subsets(te);
        int big[][]=new int[temp.length*2][];
        for(int i=0;i<temp.length;i++)
        {
            big[i]=new int[temp[i].length]; 
            for(int j=0;j<temp[i].length;j++)
            {
                big[i][j]=temp[i][j];
            }
        }
        for(int i=temp.length;i<big.length;i++)
        {
            big[i]=new int[temp[i].length+1]; 
            big[i][0]=input[0];
            for(int j=1;j<temp[i].length;j++)
            {
                big[i][j]=temp[i-temp.length][j-1];
            }
        }
        return big;
	}
	public static void main(String[] args) {
		int a[]=input();
		
	}
}
