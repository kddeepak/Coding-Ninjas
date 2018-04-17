import java.util.Scanner;

public class LargestRoworColumn {
	
	public static int Largest(int a[])
	{
		int max=0;
		int i;
		int b=0;
		for( i=0;i<a.length;i++)
		{
		if(a[i]>max)
		{
			max=a[i];
			b=i;
		}
		}
		return b;
	}
	public static void printArray(int input[])
	{
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int r=s.nextInt();
		int c=s.nextInt();
		int rsum[]=new int[r];
		int csum[]=new int[c];
		
		int arr[][]=new int[r][c];
		for(int i=0;i<r;i++)
		{
			int sum=0;
			int sumc=0;
			for(int j=0;j<c;j++)
			{
				arr[i][j]=s.nextInt();
				sum+=arr[i][j];
				
				csum[j]+=arr[i][j];
			}
			rsum[i]=sum;
		}
		int p=Largest(rsum);
		int q=Largest(csum);
		if(rsum[p]>csum[q])
			System.out.println("row"+" "+p+" "+rsum[p]);
		else
			System.out.println("column"+" "+q+" "+csum[q]);
	}

}
