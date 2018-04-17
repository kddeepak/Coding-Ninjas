import java.util.Scanner;

public class CompressString {
	public static char compress(String input) {
		// Write your code here
		int i=0;
		char c=input.charAt(0);
		
		int max=0;
		char c1=input.charAt(0);
		
        while(i<input.length())
        {
            int count=0;
            while(i<input.length() && input.charAt(i)==c1)
            {
                count+=1;
                i+=1;
            }
            if(count>max)
                max=count;
                c=input.charAt(i-1);
            
            if(i<input.length())
		        c1=input.charAt(i);
                
        }
        return c;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String s4=s.nextLine();
		char s2=compress(s4);
		System.out.println(s2);
		
		
		
	}

}
