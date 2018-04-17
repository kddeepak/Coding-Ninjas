import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class oilspill {
	static int  count =0;
	public static int oil(int[][] arr ,int i , int j)
	{
		int left=0,right=0,top=0,bot=0;
		
		
		if (i<0 || i>=arr.length|| j<0 || j>=arr[0].length)
			return 0;
		ArrayList<Integer> al = new ArrayList<>(); 
		
		int mm = Integer.MAX_VALUE;
		if(i-1>=0 && j>=0)
		{
			top=arr[i-1][j];
			if(top<arr[i][j])
			al.add(top);
			if(top<mm)
				mm=top;
		}
		
		if(i>=0 && j-1>=0)
		{
			left=arr[i][j-1];
			if(left<arr[i][j])
			al.add(left);
			if(left<mm)
				mm=left;
			
		}
		
		if(i+1<arr.length && j>=0)
		{
			bot=arr[i+1][j];
			if(bot<arr[i][j])
			al.add(bot);
			if(bot<mm)
				mm=bot;
			
		}
		
		if(i>=0 && j+1<arr[0].length)
		{
			right=arr[i][j+1];
			if(right<arr[i][j])
			al.add(right);
			if(right<mm)
				mm=right;
			
		}
		
	if(mm>arr[i][j])
	{
		return 1;
	}
	int min = find(al,arr[i][j]);
	int m=-1,n=-1,o=-1,q=-1;
	if(i-1>=0 && j>=0)
	{
	if(arr[i-1][j]==min)
		m=oil(arr,i-1,j);
	}
	if(i+1<arr.length && j>=0)
	{
	if(arr[i+1][j]==min)
		n=oil(arr,i+1,j);
	}
	if(i>=0 && j-1>=0)
	{
	if(arr[i][j-1]==min)
		o=oil(arr,i,j-1);
	}
	if(i>=0 && j+1<arr[0].length)
	{
	if(arr[i][j+1]==min)
		q=oil(arr,i,j+1);
	}
	
	return Math.max(m,Math.max(n,Math.max(o, q)))+1;
		
	
		
		
	}
	
	private static int find(ArrayList<Integer> al,int p) {
		Collections.sort(al);
		int m= al.get(al.size()-1);
		return m;
	}

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int row = s.nextInt();
		int col = s.nextInt();
		int arr[][] = new int[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int r = s.nextInt();
		int c = s.nextInt();
		
		int z =oil(arr,r-1,c-1);
		System.out.println(z);
		
		
	}

}

/*3 3
45 40 40 
50 55 70 
56 58 60 
2 3*/