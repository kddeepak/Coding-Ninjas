import java.util.Scanner;

public class Question8d {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
	    int a = s.nextInt();
	    int i =1;
	    int temp =a;
	    while(i<=a)
	    {
	      int j=1;
	      while(j<=temp)
	      {
	          System.out.print(j);
	          j+=1;
	      }
	      i+=1;
	      temp-=1;
	      System.out.print("\n");
	    }

	}
}
