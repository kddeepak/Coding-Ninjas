import java.util.Scanner;

public class Question6 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
	    int delta=b*b;
		int delta2=4*a*c;
		int d=delta-delta2;
		double rd=Math.sqrt(d);
		double r1=0.0,r2=0.0;
		if (d==0)
		{
		    r1=(-b)/(2*a);
		    r1=(Math.round(r1));
		    System.out.println("0");
		    System.out.println((int)(r1)+" "+(int)(r1));
		}
		else if (d>0)
		{
	        r1=((-b)-rd)/(2*a);
	        r1=(Math.round(r1));
	        r2=((-b)+rd)/(2*a);
	        r2=(Math.round(r2));
		    System.out.println("1");
		    System.out.println((int)(r2)+" "+(int)(r1));
		}
		
	    else if (d<0)
		    System.out.println("-1");
		    
		    
	}

}
