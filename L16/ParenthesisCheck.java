package L16;

import java.util.Scanner;

public class ParenthesisCheck {
	 public static int count=0;
	 public static int c1=0;
	 public static int c2=0;
	   public static char top(char[] arr)
	    {
	        return arr[count-1];
	    }
	    public static boolean isempty()
	    {
	        return count==0;
	    }
	    public static void push(char element,char[] arr)
	    {
	        arr[count]=element;
	        c1+=1;
	        count+=1;
	    }
	    public static void pop(char arr[])
	    {
	        count-=1;
	        c2+=1;
	        
	    }
		public static boolean checkRedundantBrackets(String input)
		{
		   
		   char arr[] = new char[100];
		   for(int i=0;i<input.length();i++)
		   {
			   if(isempty())
			   {
				  push(input.charAt(i),arr); 
			   }
			   else
			   {
				   if(input.charAt(i)==')' && top(arr)=='(')
				   {
					   return true;
				   }
				   else if(input.charAt(i)==')')
				   {
					   while( top(arr)!='(')
					   {
						   pop(arr);
					   }
					   pop(arr);
				   }
				   else
					   push(input.charAt(i),arr);
			   }
			 
		   }
		    
		   return false;

}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String S = s.nextLine();
			boolean b = checkRedundantBrackets(S);
			System.out.println(b);
		}
}
