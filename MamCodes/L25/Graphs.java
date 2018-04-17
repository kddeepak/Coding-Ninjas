package L25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Graphs {

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
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		dfsHelper(adjacencyList, 1, visited);
	}
	
	//BFS--->>>

	public static void printBFSTraversal(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
		queue<Integer> q = new queue<Integer>();
		q.enqueue(1);
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>(); 
		while(!q.isEmpty()) {
			int current = q.dequeue();
			if(!visited.containsKey(current)) {
				System.out.println(current);
				visited.put(current, true);

				ArrayList<Integer> a = adjacencyList.get(current);
				for(int i : a) {
					if(!visited.containsKey(i)) {
						q.enqueue(i);
					}
				}
			}
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
