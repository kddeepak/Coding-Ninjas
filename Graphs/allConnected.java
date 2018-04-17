package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
//return all connected components....
public class allConnected {
	static int c=0;
	static int pathc=0;
	static ArrayList<Integer> al = new ArrayList<Integer>();
	static ArrayList<Integer> al2 = new ArrayList<Integer>();
	static HashMap<Integer, ArrayList<Integer>> gm = new HashMap<Integer, ArrayList<Integer>>(); 
	public static void dfsHelper(HashMap<Integer, ArrayList<Integer>> adjacencyList, int startingVertex, HashMap<Integer, Boolean> visited) {
		System.out.print(startingVertex + " ");
		c++;
		
		visited.put(startingVertex, true);
		ArrayList<Integer> a = adjacencyList.get(startingVertex);
		for(int i:a){
			if(!visited.containsKey(i)){
				pathc+=1;
			}
		}
		for(int i : a) {
			
			
			if(!visited.containsKey(i)) {
				
				
				dfsHelper(adjacencyList, i, visited);
			}
		}
	}

	public static void printDFSTraversal(HashMap<Integer, ArrayList<Integer>> adjacencyList) {
		HashMap<Integer, Boolean> visited = new HashMap<Integer, Boolean>();
		dfsHelper(adjacencyList, strt, visited);
		al.add(c);
		al2.add(pathc);
		c=0;
		pathc=0;
		
		System.out.println();
		while(visited.size()!=adjacencyList.size())
		{
			
			for(int i :adjacencyList.keySet())
			{
				
				if(visited.containsKey(i)==false)
				{
					
					dfsHelper(adjacencyList, i, visited);
					al.add(c);
					al2.add(pathc);
					pathc=0;
					c=0;
					
					System.out.println();
				}
			}
		}
	}
	//test cases...
	//9 6 1 2 2 3 4 5 5 6 7 8 8 9//normal
	//8 8 1 2 1 3 3 4 1 5 5 6 6 7 6 8 4 7//closed graph
	static int strt=0;
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int e = s.nextInt();

		HashMap<Integer, ArrayList<Integer>> adjacencyList = new HashMap<Integer, ArrayList<Integer>>();

		int count = 1;
		while(count <= e) {
			int source = s.nextInt();
			int dest = s.nextInt();
			if(count==1)
				strt=source;
			

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
			int answ=0;
		printDFSTraversal(adjacencyList);
		
		//System.out.println(al);
		//System.out.println(al2);
		
		for(int i=0;i<al.size();i++){
			
			if(al2.get(i)-1>=al.get(i)-1){
				answ+=(al.get(i)*(al.get(i)-1));
				//System.out.println(answ);
			}
			else{
				answ+=(al2.get(i)*(al2.get(i)-1));
				//System.out.println(answ);
			}
		}
		
		
		System.out.println(answ);
		
		}
}
