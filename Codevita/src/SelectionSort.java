import java.util.Scanner;

public class SelectionSort {	
	//arr is the input array you have to sort
	public static void selectionSort(int[] arr){
		//write your code here
		int start=0;
		
		int end =arr.length-1;
		while(start<end)
		{
			int loc =start;
			int temp;
			int min=arr[start];
			int i=start+1;
			while(i<=end)
			{
				if(arr[i]<min)
				{
					min=arr[i];
					loc=i;
				}
				i+=1;
			}
			temp=arr[start];
			arr[start]=arr[loc];
			arr[loc]=temp;
			
			start+=1;
			int count =0;
			for(int k=0;k<arr.length-1;k++)
			{
			    if(arr[k]<arr[k+1])
			        count++;
			}
			if(count==arr.length-1)
			break;
			
			
		}
		
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<arr.length;i++)
			arr[i]=s.nextInt();
		long startTime = System.nanoTime();
		selectionSort(arr);
		long endTime = System.nanoTime();

		long duration = (endTime - startTime); 
		System.out.println(duration );
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
}