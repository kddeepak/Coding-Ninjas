import java.util.Scanner;

public class IncDec {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 1;
		int temp =s.nextInt();
		int inc=0;
		int dec=0;
		int incri=0;
		int decri=0;
		while(i<a)
		{
		    int in = s.nextInt();
		    if(in<temp)
		    {
		        if(incri==1)
		            dec+=1;
		        decri=1;   
		        incri=0;
		        
		    }
		    if(in>temp)
		    {
		        if(decri==1)
		            inc+=1;
		        incri=1;
		        decri=0;
		    }
		    
		    i+=1;      
		}
		if(inc==1 && dec==0 && incri==1){
	        System.out.println("true");
	        
	    			}
		else if (inc==0 &&  incri==1 )
			System.out.println("true");
		else if (dec==0 &&  decri==1 )
			System.out.println("true");
		else
			System.out.println("false");
		
	}
}
