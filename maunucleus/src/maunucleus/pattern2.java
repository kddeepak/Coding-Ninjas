package maunucleus;

import java.util.Scanner;

public class pattern2 {
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
				
				System.out.print("*");
				k+=1;
				j+=1;
			}
			k=k-2;
			while(j<=a+i-1)
			{
				System.out.print("*");
				k=k-1;
				j+=1;
			}
			System.out.println("\n");
			i+=1;
		}
		
		
		
	}

}
