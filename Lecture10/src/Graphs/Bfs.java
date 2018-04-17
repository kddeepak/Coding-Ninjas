package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import L17.QueueUsingLL1;

public class Bfs {
	//BFS--->>>

		public static int printBFSTraversal(HashMap<Integer, ArrayList<Integer>> adjacencyList,int start,int count) {
			QueueUsingLL1<Integer> q = new QueueUsingLL1<Integer>();
			q.enqueue(start);
			HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>(); 
			while(!q.isEmpty()) {
				int current = q.dequeue();
				if(visited.containsKey(current)==false) {
				   System.out.println(current);
					visited.put(current, true);
					count++;
					ArrayList<Integer> a = adjacencyList.get(current);
					for(int i : a) {
						if(visited.containsKey(i)==false) {
							
							q.enqueue(i);
						}
					}
				}
			}
			return count;
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
			int start=s.nextInt();
			printBFSTraversal(adjacencyList,start,0);
		}

}
