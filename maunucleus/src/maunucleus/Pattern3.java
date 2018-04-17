package maunucleus;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i=1;
		while(i<=a)
		{
		    int count=0;
		    int j=a-i+1;
		    while(j<=a)
		    {
		        System.out.print(j);
		        count+=1;
		        j+=1;
		    }
		    while(count<a)
		    {
		    	System.out.print(a);
		    	count+=1;
		    }
		    i+=1;
		    System.out.print("\n");
		}
		
		
	}

}
