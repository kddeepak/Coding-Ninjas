import java.util.Scanner;

public class Palindrome {
	public static void Palindrome(String input)
	{
		int count=0;
		for(int i=0;i<input.length()/2;i++)
		{
			
			
			if(input.charAt(i)==input.charAt(input.length()-1-i))
			{
				count+=1;
			}
			
		}
		if(count==(input.length()/2))
		{
			System.out.println("true");
		}
		else
			System.out.println("false");
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s1=s.nextLine();
		Palindrome(s1);
		
		
	}

}
