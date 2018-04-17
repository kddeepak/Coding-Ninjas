package kd2;

public class test {

	public static char[][] matrix(String[] Graph,int N,int M)
	{
		char[][] mat = new char[2][2];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				mat[i][j]=Graph[i].charAt(j);
			}
		}
		return mat;
	}
	public static void main(String[] args) {
		String[] Graph = new String[2];
		Graph[0]="CX";
		Graph[1] ="BO";
		char[][] ans =matrix(Graph,2,2);

		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(ans[i][j]);
			}
			System.out.println();
		}
		
	}
}
