import java.util.Scanner;

public class Question1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		char r=s.next().charAt(0);
		
		int m1 =s.nextInt();
		int m2 =s.nextInt();
		int m3 =s.nextInt();
		int sub = 0;
		int average;
		if (m1<=m2 && m1<=m3)
		{
			sub=m1;
		}
		else if (m2<=m1 && m2<=m3)
		{
			sub=m2;
		}
		else if (m3<=m2 && m3<=m1)
		{
			sub=m3;
		}
		average=(m1+m2+m3-sub)/2;
		
		System.out.println(r+" "+average);
	}

}
