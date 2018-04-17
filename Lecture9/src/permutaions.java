public class permutaions {
	  public static int factorial(int number) {
	      if (number <= 1) return 1;
	      else return number * factorial(number - 1);
	   }

	public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length()==1)
		{
			String t[]=new String[1];
			t[0]=input;
			return t;
		}
		//String big[]=new String[factorial(input.length())];
		String arr[] =new String[factorial(input.length()-1)];
		for(int i=0;i<input.length();i++)
		{
			String temp[]=permutationOfString(input.substring(0,i)+input.substring(i+1));
			
			int count=0;

			for(int j=0;j<temp.length;j++)
			{
				arr[count]=input.charAt(i)+temp[j];
				count+=1;
			}
			
		}
		return arr;
	}
}

