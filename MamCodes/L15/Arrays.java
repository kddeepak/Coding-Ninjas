package L15;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		
		System.out.println(a.size());
//		System.out.println(a.get(0));
		a.add(10);
		a.add(10);		// add element at last index
		a.add(2, 100);	// Inserts element at index 0,
						// shifts all elements towards right by 1
	
		a.remove(1);
		System.out.println(a.size());
		
		a.set(0, 30);	// replace the value at index 0 with 30
		
		
		// 2D dynamic array
		ArrayList<Integer> c = new ArrayList<Integer>();
//		System.out.println(c.get(0));	// Error
		a.add(10);
		System.out.println(a.get(0));
		
		ArrayList<ArrayList<Integer>> b = 
				new ArrayList<ArrayList<Integer>>();
		
//		System.out.println(b.get(0));	// Error
		
//		ArrayList<Integer> b0 = new ArrayList<Integer>();
		/*b0.add(100);
		
		
		b.add(b0);
		
		b.get(0).add(10);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
