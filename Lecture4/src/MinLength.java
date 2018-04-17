import java.util.Scanner;

public class MinLength {
	public static String minLengthWord(String input)
	{
		String s5="";
		int i=0;
		int min=Integer.MAX_VALUE;
		while(i<input.length())
		{
			
			String s4="";
			
			while(i<input.length() && input.charAt(i)!=' ')
			{
				s4=s4+input.charAt(i);
				i+=1;
				
				
			}
			
			if(s4.length()<min)
			{
				min=s4.length();
				
				s5=s4;
			}
			
			i+=1;
		}
		return s5;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s1=s.nextLine();
		String s2=minLengthWord(s1);
		System.out.println(s2);
		
		
		
	}

}
