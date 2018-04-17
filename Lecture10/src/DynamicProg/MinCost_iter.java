package DynamicProg;

public class MinCost_iter {
	public static int minCost(int input[][], int ans[][], int i, int j) {
	
		if(input.length==1 && input[0].length==1)
			return input[0][0];
		
		ans[i][j]=input[i][j];
		for(i=)
		
		
		
	}
	public static void main(String[] args) {
		int input[][]= {{1, 2, 3},
                {4, 8, 2},
                {1, 5, 3}};
		 int[][] ans= new int[3][3];
		 int x=minCost(input,ans,input.length-1,input[0].length-1);
		 System.out.println(x);
		 
	}

}
