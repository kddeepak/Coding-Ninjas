import java.util.Scanner;

public class toptendiviible {
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int count=1;
		int n=1;
		while(count!=a+1)
		{
		    if((3*n+2)%4!=0)
		    {
		        System.out.print((3*n+2)+" ");
		        count+=1;
		        
		    }
		    n+=1;
		}
}
}
