import java.util.Scanner;

public class Strings {
	public static int printCharacter(String input)
	{
		int count=0;
		for(int i=0;i<input.length();i++)
		{
			if(input.charAt(i)==' ')
			{
				count+=1;
			}
		}
		return count+1;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		String s1=s.nextLine();
		int z=printCharacter(s1);
		System.out.println(z);
		
	}

}
