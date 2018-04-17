package maunucleus;

import java.util.Scanner;

public class Pattern2a {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		int i=1;
		while(i<=a)
		{
			int j=1;
			while(j<=a-i)
			{
				System.out.print(" ");
				j+=1;
			}
			int k =i;
			while(j<=a)
			{
				
				System.out.print(k);
				k+=1;
				j+=1;
			}
			
			System.out.println("\n");
			i+=1;
		}
		
		
		
	}

}
