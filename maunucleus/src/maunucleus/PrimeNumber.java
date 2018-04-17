package maunucleus;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a =s.nextInt();
		
		int j=2;
		
		while(j<=a)
		{
		int i=2;
		int count = 0;
		while(i<j)
		{
			if(j%i==0)
				count+=1;
			i+=1;
		}
		if(count==0)
			System.out.println(j);
		j+=1;
		}
		
		
		
		
	}
}
