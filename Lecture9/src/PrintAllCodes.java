public class PrintAllCodes {

	// Return a string array that contains all possible codes
	public static char alpha(int n)
	{
	    
	    char arr[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	    return arr[n-1];
	}
	public static  String[] getCode(String input){
		// Write your code here
		if(input.length()==0)
		{
		    String temp[]={""};
		    return temp;
		}
		if(input.length()==1)
		{
		    String temp[]=new String[1];
		    char c=alpha(Integer.valueOf(input));
		    String s=""+c;
		    temp[0]=s;
		    return temp;
		}
		int size=1;
		String[] temp1=getCode(input.substring(1));
		   String y=""+input.substring(0,2);
		   String[] temp2=getCode(input.substring(2)); 
		   size=temp2.length;
		
		if(Integer.valueOf(y)>26 )
		{
		    size=0;
		}
	
		String[] big=new String[temp1.length+size];
		for(int i=0;i<temp1.length;i++)
		{
		    String s=""+input.charAt(0);
		    temp1[i]=alpha(Integer.valueOf(s))+temp1[i];
		}
		String x=""+input.substring(0,2);
		 if(Integer.valueOf(x)>=10 && Integer.valueOf(x)<=26)
		{
		for(int i=0;i<temp2.length;i++)
		{
		    String s=""+input.substring(0,2);
		   
		    
		    temp2[i]=alpha(Integer.valueOf(s))+temp2[i];
		    
		}
		}
		
		for(int i=0;i<temp1.length;i++)
		{
		    big[i]=temp1[i];
		}
		if(size>0)
		{
		for(int i=temp1.length;i<big.length;i++)
		{
		    big[i]=temp2[i-temp1.length];
		}
		}
		return big;
	}

}

