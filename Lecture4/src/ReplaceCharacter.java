import java.util.Scanner;

public class ReplaceCharacter {
	public static String replaceCharacter(String input, char c1, char c2)
	{
		String s3="";
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==c1)
			{
				s3=s3+c2;
			}
			else
				s3=s3+input.charAt(i);
		}
		return s3;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s1=s.next();
		char c1=s.next().charAt(0);
		char c2=s.next().charAt(0);
		String s2=replaceCharacter(s1,c1,c2);
		
		
		
	}

}
