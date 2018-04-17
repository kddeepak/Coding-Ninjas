package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class allpathsum {
	public static int fb(int n) {
		if(n<=2)
			return n;
		int ans[] = new int[n + 1];
		
		ans[1] = 1;
		ans[2]=2;
		for(int i = 3; i <= n; i++) {
			ans[i] = ans[i - 1] + ans[i - 2];
		}
		return ans[n];
	}

	public static void  print(int[] a,int as)
	{
		for(int i=0;i<as;i++)
			//System.out.print(a[i]+" ");
			al.add(a[i]);
	}
	static ArrayList<Integer> al = new ArrayList<>();
	
	private static void ispathHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList,HashMap<Integer, Boolean> visited,int start,int end,int[] arr,int as) 
	{
			ArrayList<Integer> a = (adjacencyList.get(start));
			visited.put(start, true);
			arr[as++]=start;
			for(int i : a)
			{
				if(i==end)
				{
					arr[as++]=end;
					print(arr,as);//if a path is found then print it otherwise dont/.--?>>
					//System.out.println();
					return;
				}
							
			}
			for(int i : a)
			{
				if(visited.containsKey(i)==false)
				{
					ispathHelper(adjacencyList,visited, i, end,arr,as);
					
				}
			}
				
			
		
	}
	
	public static void ispath(HashMap<Integer, ArrayList<Integer>> adjacencyList,int start,int end)
	{
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		int a[] = new int[100];
		 ispathHelper(adjacencyList,visited,start,end,a,0);
		 
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		//int e = s.nextInt();

		HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();

		int count = 1;
		while(count <= n-1) {
			int source = s.nextInt();
			int dest = s.nextInt();

			if(adjacencyList.containsKey(source)) {
				adjacencyList.get(source).add(dest);
			}
			else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(dest);
				adjacencyList.put(source, a);
			}
			if(adjacencyList.containsKey(dest)) {
				adjacencyList.get(dest).add(source);
			}
			else {
				ArrayList<Integer> a = new ArrayList<Integer>();
				a.add(source);
				adjacencyList.put(dest, a);
 			}
			count++;
		}
		int wt[] = new int[n+1];
        for(int i=1;i<n+1;i++)
        {
            wt[i]=s.nextInt();
        }

		//printDFSTraversal(adjacencyList);
		int sum=0;
		for(int i : adjacencyList.keySet())
		{
			for(int j : adjacencyList.keySet())
			{
				if(i!=j)
				{
					ispath(adjacencyList, i, j);
					//System.out.println(al);
					int sm=0;
					for(int k=0;k<al.size();k++)
					{
						
						sm+=wt[al.get(k)];
						
					}
					
					
					sum+=fb(sm);
					
					
					al.clear();
				}
			}
		}
		for(int i : adjacencyList.keySet())
		{
			sum+=fb(wt[i]);
		}
		System.out.println(sum);
		//6 5 1 4 4 5 4 2 2 6 6 3
		
	}
}
