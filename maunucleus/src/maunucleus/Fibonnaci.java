package maunucleus;

import java.util.Scanner;

public class Fibonnaci {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int a = s.nextInt();
		int x=1;
		int y=1;
		int count=3;
		int c;
		
		while(count<=a)
		{
			
			c=y;
			y=x+y;
			x=c;
			count+=1;
			
			System.out.println(y);	
		}
		
		
		
	}

}
