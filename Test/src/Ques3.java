import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int sum=0;
		int count=0;
		int temp=a;
		int temp2=a;
		while(a!=0)
		{
			a=a/10;
			count+=1;
			
		}
		
		while(temp!=0)
		{
			int r = temp%10;
			sum+=(Math.pow(r, (count)));
			temp=temp/10;
		}
		
		if(temp2==sum)
			System.out.println("true");
		else
			System.out.println("false");
		
	}

}
