import java.util.Scanner;

public class fair {
	public static int sum(int arr[],int s,int g)
	{
		if(s==arr.length)
			return 0;
		int a[] = new int[arr.length-g-1];
		for(int i=0;i<arr.length-g-1;i++)
		{
			a[i]=arr[g+1+i];
		}
		int ans=.0
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int g = s.nextInt();
		int arr[] = new int[a];
		for(int i=0;i<a;i++)
			arr[i]=s.nextInt();
		int x =sum(arr,0,g);
	}
}
