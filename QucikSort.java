//self made...
import java.util.Scanner;

public class QucikSort {
	
	
	public static int partition(int[] a,int p ,int r){
		
		int x = a[p];
		
		int i =p;
		
		for(int j=p+1;j<=r;j++){
			
			if(a[j]<x){
				
				i=i+1;
				//swapping 
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		
		int t = a[p];
		a[p]=a[i];
		a[i]=t;
		
		return i;//return the location of the pivot element..
	}
	
	public static void quickSort(int[] a, int p,int r){
		
		if(p<r){
			
			int q = partition(a, p, r);
			
			quickSort(a, p, q-1);
			quickSort(a, q+1, r);
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter array size");
		int n = s.nextInt();
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++){
			
			a[i]=s.nextInt();
		}
		
		quickSort(a, 0, n-1);
		
		for(int i : a){
			System.out.print(i+" ");
		}
		
		
	}

}
