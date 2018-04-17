package Graphs;

import java.util.Scanner;

public class pathinMatrix {

	public static char[][] matrix(String[] Graph,int N,int M)
	{
		char[][] mat = new char[N][M];
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				mat[i][j]=Graph[i].charAt(j);
			}
		}
		return mat;
	}
	static int count=0;
	//done using dfs applied in all the 8 directions...
	public static int getString(char[][] mat , String s, int i, int j,int k)
	{
		int n = mat.length;
		int m = mat[0].length;
		if(i<0 || i >=n || j<0 || j >=m)
			return 0;
		if(k==s.length()-1 && mat[i][j]==s.charAt(k) )
		{
			count+=1;
			return 1;
		}
		if(mat[i][j]==s.charAt(k))
		{
			char temp = mat[i][j];
			mat[i][j]='#';
			//recursion calls for all 8 directions..
			//need to use dp so as solve it optimally.
		 getString(mat, s, i+1, j, k+1);
		 getString(mat, s, i, j+1, k+1);
		 getString(mat, s, i-1, j, k+1);
		 getString(mat, s, i, j-1, k+1);
		 getString(mat, s, i+1, j+1, k+1);
		 getString(mat, s, i+1, j-1, k+1);
		 getString(mat, s, i-1, j+1 ,k+1);
		 getString(mat, s, i-1, j-1, k+1);
		mat[i][j]=temp;
		
		
		}
		
		return count;
		
	}
	
	public static int solve(String[] Graph ,String S, int N, int M)
	{
		
		char[][] mat = new char[N][M];
		mat=matrix(Graph,N,M);
		int cc=0;
		for(int i=0;i<N;i++)
		{
			for(int j=0;j<M;j++)
			{
				//String s = "DEEPAK";
				int k=0;
				int x = getString(mat, S, i, j, k);
				cc+=x;
				count=0;
			}
		}
		return cc;
		
	}	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] Graph = new String[8];
		int n = s.nextInt();
		String S = s.next();
		for(int i=0;i<8;i++){
			Graph[i]=s.next();
		}
		int ans =solve(Graph,S,8,8);
		System.out.println(ans);
		
	}
}
