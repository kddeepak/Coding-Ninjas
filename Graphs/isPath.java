package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class isPath {

	private static boolean ispathHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList,HashMap<Integer, Boolean> visited,int start,int end) 
	{
			ArrayList<Integer> a = (adjacencyList.get(start));
			visited.put(start, true);
			for(int i : a)
			{
				if(i==end)
					return true;
			}
			for(int i : a)
			{
				if(visited.containsKey(i)==false)
				{
					boolean b=ispathHelper(adjacencyList,visited, i, end);
					if(b==true)
						return true;
				}
			}
				
			return false;
		
	}
	
	public static boolean ispath(HashMap<Integer, ArrayList<Integer>> adjacencyList,int start,int end)
	{
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		return ispathHelper(adjacencyList,visited,start,end);
		
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
		boolean b =ispath(adjacencyList, 1, 8);
		boolean c =ispath(adjacencyList, 2, 4);
		boolean d =ispath(adjacencyList, 8, 11);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		//11 10 7 6 6 1 1 2 2 3 2 4 4 5 5 3 8 9 9 11 9 10
	}
}
