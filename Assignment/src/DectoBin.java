import java.util.Scanner;

public class DectoBin {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int r=0;
		int arr[]=new int[100];
		int i =0,j=0;
		while(a!=0)
		{
			r=a%2;
			arr[i]=r;
			a=a/2;
			i+=1;
		}
		j=i-1;
		while(j>=0)
		{
			System.out.print(arr[j]);
			j-=1;
		}
	}
}
