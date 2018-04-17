package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DFS {
	public static void dfsHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int startingVertex, HashMap<Integer, Boolean> visited) {
		System.out.print(startingVertex + " ");
		visited.put(startingVertex, true);
		ArrayList<Integer> a = adjacencyList.get(startingVertex);
		for(int i : a) {
			if(!visited.containsKey(i)) {
				dfsHelper(adjacencyList, i, visited);
			}
		}
	}

	public static void printDFSTraversal(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
		
		for(int i : adjacencyList.keySet())
		{
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		dfsHelper(adjacencyList, i, visited);
		System.out.println();
		}
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

		printDFSTraversal(adjacencyList);
	}
}
