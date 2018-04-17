package kd1;

import java.util.*;

public class Al {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<String> a = new ArrayList<String>();
		for(int i=0;i<5;i++)
			a.add(s.next());
		
		System.out.println(a);
		System.out.println(a.get(0));
		System.out.println(a.set(0, "Deepak"));
		System.out.println(a);
		
	}
	

}
