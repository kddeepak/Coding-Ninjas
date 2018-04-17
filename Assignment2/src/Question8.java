import java.util.Scanner;

public class Question8 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i=1;
		while(i<=a)
		{
			int j=1;
			while(j<=i)
			{
				System.out.print("1");
				j+=1;
			}
			System.out.print("\n");
			i+=1;
		}
	}
}
