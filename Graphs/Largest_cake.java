package Graphs;

import java.util.Scanner;

public class Largest_cake {
	//static int m=0, n=0;
	 static int forest[][];
	 static int c=0;
	 static int ans[][];
	 public static void fire(int mi, int mj,int i,int j,int count) {
		 if(i<0 || i>=mi || j<0 || j>=mj  || forest[i][j]==0)
			 return;
			
			if(i>=0 && i<mi && j>=0 && j<mj && forest[i][j]==99)
			{
				ans[i][j]=count;
				forest[i][j]=count;
				
				if(j+1<mj)
					fire(mi,mj,i,j+1,count+1);
				if(j-1>=0)
					fire(mi,mj,i,j-1,count+1);
				if(i-1>=0)
					fire(mi,mj,i-1,j,count+1);
				if(i+1<mi)
					fire(mi,mj,i+1,j,count+1);
				if(i-1>=0 && j-1>=0)
					fire(mi,mj,i-1,j-1,count+1);
				if(i-1>=0 && j+1<mj)
					fire(mi,mj,i-1,j+1,count+1);
				if(i+1<mi && j-1>=0)
					fire(mi,mj,i+1,j-1,count+1);
				if(i+1<mi && j+1<mj)
					fire(mi,mj,i+1,j+1,count+1);
			}
			
			
		}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		  int m = s.nextInt();
		
		 forest =new int[m][m];
		 
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<m;j++)
			 {
				int a = s.nextInt();
				 if(a==1)
					 forest[i][j]=99;
				 else
					 forest[i][j]=0;
			 }
			 
		 }
		 int max = Integer.MIN_VALUE;
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				if(forest[i][j]==99)
				{
				int count=1;
				ans = new int[m][m];
				fire(forest.length,forest[0].length,i,j,count);
				c=0;
					for(int y=0;y<m;y++)
					{
						for(int z=0;z<m;z++)
						{
							if(ans[y][z]!=0)
								c++;
						}
					}
					if(c>max)
						max=c;
				}
			}
		}
		 
		System.out.println(max);
		 
	}
	

}
/*W T T T T T
T W W W W W
W T T T T T
W W W W W T
T T T T T T
T W W W W W
1 6*/

