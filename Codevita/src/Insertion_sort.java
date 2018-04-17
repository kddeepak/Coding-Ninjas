import java.util.Scanner;

public class Insertion_sort {	
	
	public static void insertionSort(int[] arr){
		
		int start=1;
		int end=arr.length-1;
		int temp;
		while(start<=end)
		{
			int i=start-1;
			temp=arr[start];
			while(i>=0 && arr[i]>temp)
			{
				arr[i+1]=arr[i];
				i-=1;
			}
			arr[i+1]=temp;
			
			
			start+=1;
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		insertionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}