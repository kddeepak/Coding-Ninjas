package maunucleus;

import java.util.Scanner;

public class FtoC {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int start = s.nextInt();
		int end = s.nextInt();
		int step = s.nextInt();
		int f = start;
		
		while(f<=end)
		{
			System.out.print(f+"\t");
			int c=(int)((5/9.0)*(f-32));
			System.out.println(c);
			f+=step;
		}
		
		
	}

}
