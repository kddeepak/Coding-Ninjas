import java.util.Scanner;

public class question8b {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i=1;
		System.out.println("1");
		while(i<=a-1)
		{
			int j=1;
			System.out.print(1);
			while(j<=(i+1-2))
			{
				System.out.print("2");
				j+=1;
				
			}
			System.out.print("1"+"\n");
			i+=1;
		}

	}

}
