import java.util.Scanner;

public class ReverseEachWord {
	public static String reverseEachWord(String input) 
	{
		String s3="";
		int i=0;
		int count=0;
		while(i<input.length())
		{
			
			String s4="";
			while(i<input.length() && input.charAt(i)!=' ')
			{
				s4=input.charAt(i)+s4;
				i+=1;
				
				
			}
			count+=1;
			if(count==1)
				s3=s3+s4;
			else
				s3=s3+" "+s4;
			i+=1;
		}
		return s3;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s1=s.nextLine();
		String s2=reverseEachWord(s1);
		System.out.println(s2);
		
		
		
	}

}
