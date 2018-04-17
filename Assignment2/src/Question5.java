import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int basic = s.nextInt();
		char c=s.next().charAt(0);
		int allow=0;
		double total=0.0;
		if (c=='A')
		    allow=1700;
		else if (c=='B')
		    allow=1500;
		else if(c=='C')
		    allow=1300;
		total=(basic+(0.2*basic)+(0.5*basic)+allow-(0.11*basic));
		total=Math.round(total);
		System.out.println((int)(total));   

	}
}
