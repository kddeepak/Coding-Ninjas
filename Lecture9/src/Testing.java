import java.util.Scanner;

public class Testing {
	public static void printStarray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}


		public static char[] Alpha(int n){
		   
		    if(n==2)
		    {
		        char arr[]={'a','b','c'};
		        return arr;
		        
		    }
		     else if(n==3)
		    {
		        char arr[]={'d','e','f'};
		        return arr;
		        
		    }
		     else if(n==4)
		    {
		        char arr[]={'g','h','i'};
		        return arr;
		        
		    }
		     else if(n==5)
		    {
		        char arr[]={'j','k','l'};
		        return arr;
		        
		    }
		     else if(n==6)
		    {
		        char arr[]={'m','n','o'};
		        return arr;
		        
		    }
		     else if(n==7)
		    {
		        char arr[]={'p','q','r','s'};
		        return arr;
		        
		    }
		     else if(n==8)
		    {
		        char arr[]={'t','u','v'};
		        return arr;
		        
		    }
		    else if(n==9)
		    {
		        char arr[]={'w','x','y','z'};
		        return arr;
		    }
		    char ans[]={'*'};
			return ans;
		}
		public static String[] keypad(int n)
		{
			if(n==0)
			{
				String s[]=new String[1];
				s[0]="";
				return s;
				
				
			}
	        String temp[]=keypad(n/10);
	        
	        String arr[]=new String[temp.length*(Alpha(n%10).length)];
	        int count=0;
	        for(int i=0;i<temp.length;i++)
			 {
	        for(int j=0;j<Alpha(n%10).length;j++)
			
			{
			   arr[count]=temp[i]+Alpha(n%10)[j];
				count+=1;
			}
			}
	        
	       return arr; 
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			printStarray(keypad(n));
		}
		
	}



