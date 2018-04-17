package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class getPath {

	public static void  print(int[] a,int as)
	{
		for(int i=0;i<as;i++)
			//System.out.print(a[i]+" ");
			al.add(a[i]);
	}
	static ArrayList<Integer> al = new ArrayList<>();
	
	private static void ispathHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList,HashMap<Integer, Boolean> visited,
																		int start,int end,int[] arr,int as) //as=arr start
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
		int a[] = new int[1000000];
		 ispathHelper(adjacencyList,visited,start,end,a,0);
		 
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();

		HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();

		int count = 1;
		while(count <= e) {
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

		//printDFSTraversal(adjacencyList);
		ispath(adjacencyList, 1, 5);
		System.out.println(al);
		al.clear();
		ispath(adjacencyList, 1, 4);
		System.out.println(al);
		
		//ispath(adjacencyList, 2,4);
		//ispath(adjacencyList, 8, 11);
		//11 10 7 6 6 1 1 2 2 3 2 4 4 5 5 3 8 9 9 11 9 10
		
	}
}
