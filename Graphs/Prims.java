package Graphs;

import java.util.Scanner;

public class Prims {

	public static void prims(int adjacencyMatrix[][],int n,int start)
	{
		int visited[] = new int[n];
		int distance[] = new int[n];
		//distance[0]=0;
		for(int i=0;i<distance.length;i++)
			distance[i]=Integer.MAX_VALUE;
		distance[start-1]=0;
		int ans[] = new int[n];
		//loop runs n-1 times because for n nodes the size of mst is n-1 edges...
		for(int i=0;i<n-1;i++)
		{
			
			//find the node whose distance is minimum..
			int min = Integer.MAX_VALUE;
			int pos=-1;
			for(int j=0;j<distance.length;j++ )
			{
				if(distance[j]<min && visited[j]!=1)
				{//min value vertex and the vertex is not visited.....
					min=distance[j];
					pos=j;
				}
			}
			//mark it as visited..
			visited[pos]=1;
			//now check the distances in the adjacency matrix..
			for(int p =0 ; p < adjacencyMatrix[pos ].length;p++)
			{
				//here 0 in adj matrix means no link..
				if(adjacencyMatrix[pos][p]!=0 && adjacencyMatrix[pos][p]<distance[p] && visited[p]!=1)//0 here represents no link..
											                                                          // and that node that gets visited is never disturbred...
				{
					distance[p]=adjacencyMatrix[pos][p];
					ans[p]=pos;
					
				}
					
			}
			
			
		}
		int fs=0;
		for(int k=0;k<ans.length;k++)
		{
			//System.out.println(k+" "+ans[k]);
			fs+=distance[k];
			
		}
		System.out.println(fs);
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int adjacencyMatrix[][] = new int[n][n];
		int edges = s.nextInt();
		while(edges>0)
		{
			int i = s.nextInt();
			int j = s.nextInt();
			int weight = s.nextInt();
			adjacencyMatrix[i][j]=weight;
			adjacencyMatrix[j][i]=weight;
			edges-=1;
		}
		int start = s.nextInt();
		prims(adjacencyMatrix,n,start);
		
		
	}
}

/*5
6
0 1 2
0 3 1
0 2 3
1 2 5
3 2 4
2 4 6*/


/*0 1 2
0 2 1
2 1 1*/