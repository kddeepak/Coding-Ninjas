import java.util.Scanner;

public class Question2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char c=s.next().charAt(0);
		if ((int)c>=65 && (int)c<=90)
		{
			System.out.println("upper case");
		}
		else if ((int)c>=97 && (int)c<=122)
		{
			System.out.println("lower case");
		}
		else
			System.out.println("invalid");
	}

}
