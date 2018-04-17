package maunucleus;

import java.util.Scanner;

public class Pattern {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int i=0;
		int k=1;
		while(i<a)
		{	
			int j=0;
			k=i+1;
			while(j<i+1)
			{
				System.out.print(k);
				k+=1;
				j+=1;
				
			}
			i+=1;
			System.out.println("\n");
		}
	}


}
