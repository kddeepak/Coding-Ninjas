package DynamicProg;

public class MinCost_recur {
		
	public static int minCost(int input[][], int ans[][], int i, int j) {
		
		int x = Integer.MIN_VALUE, y = Integer.MIN_VALUE, z = Integer.MIN_VALUE;
		if(i<0 || j<0 || i>=input.length || j>=input[0].length){
			return 	Integer.MIN_VALUE;
		}
		if (i== input.length-1 && j == input[0].length-1)
		{
			ans[i][j]=input[i][j];
			
		      return ans[i][j];
		}
		if(j + 1 < input[0].length && ans[i][j + 1] == 0) {
			input[i][j+1]=0;
			ans[i][j + 1]=minCost(input, ans, i, j + 1);
			
			 x = ans[i][j + 1];
		}
		else if(j + 1 < input[0].length && ans[i][j+1]!=0)
			x=ans[i][j+1];
		
			
		if(i + 1 < input.length && ans[i + 1][j] == 0) {
			input[i+1][j]=0;
			ans[i + 1][j]= minCost(input, ans, i+1, j);
			
			y = ans[i + 1][j];
			
		}
		else if(i + 1 < input.length && ans[i + 1][j] != 0)
			y=ans[i+1][j];
		
		
		if( j - 1>=0 && ans[i][j-1] == 0) {
			input[i][j-1]=0;
			ans[i][j-1]= minCost(input, ans, i, j - 1);
			
			z = ans[i][j-1];
		}
		else if (j - 1>=0  && 
				ans[i][j-1] !=0)
			z=ans[i][j-1];
		
		ans[i][j] = Math.max(x, Math.max(y, z)) + input[i][j];
		//input[i][j]=Integer.MIN_VALUE;
		return ans[i][j]; 
	}
	public static void main(String[] args) {
		int input[][]= {{1,2,3,-1,-2},
                {-5,-8,-1,2,-150},
                {1,2,3,-250,100},
                {1,1,1,1,20}};
		 int[][] ans= new int[4][5];
		 int x=minCost(input,ans,0,0);
		 System.out.println(x);
		 
	}
}
