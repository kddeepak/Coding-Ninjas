import java.util.Scanner;

public class forestfire {
	//static int m=0, n=0;
	 static int forest[][];
	 
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
				
				//forest[i][j]=99;
			}
			
			
		}
	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
		  int m = s.nextInt();
		 int n = s.nextInt();
		 forest =new int[m][n];
		 ans = new int[m][n];
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				 char a=s.next().charAt(0);
				 if(a=='T')
					 forest[i][j]=99;
				 else
					 forest[i][j]=0;
			 }
			 
		 }
		int x = s.nextInt();
		int y = s.nextInt();
		int count=1;
		 fire(forest.length,forest[0].length,x-1,y-1,count);
		 
		 for(int i=0;i<m;i++)
		 {
			 for(int j=0;j<n;j++)
			 {
				System.out.print(ans[i][j]+" ");
			 }
			 System.out.println();
		 }
		
		 
	}
	

}
/*W T T T T T
T W W W W W
W T T T T T
W W W W W T
T T T T T T
T W W W W W
1 6*/

