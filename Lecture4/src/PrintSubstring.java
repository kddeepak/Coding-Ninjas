import java.util.Scanner;

public class PrintSubstring {
	public static void printSubstrings(String input)
	{
		for(int i=0;i<input.length();i++)
		{
			
			int j=i;
			while(j<input.length())
			{
				System.out.println(input.substring(i,j+1 ));
				j+=1;
			}
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s1=s.nextLine();
		printSubstrings(s1);
		
		
	}

}
