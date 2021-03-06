//coding ninjas
package Lecture11;

import java.util.Scanner;

public class QuickSort {
	public static int[] Ainput()
	{
		Scanner s = new Scanner(System.in);
		int a= s.nextInt();
		int in[]=new int[a];
		for(int i=0;i<a;i++)
		{
			in[i]=s.nextInt();
		}
		return in;
	}
	public static void print(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
	public static int getPivotIndex(int[] input,int start,int end)
	{
		int pivot=input[start];
		int index=start;
		for(int i=start+1;i<=end;i++)
		{
			if(input[i]<=pivot)
			{
				index+=1;
			}
		}
		int temp=input[index];
		input[index]=pivot;
		input[start]=temp;
		int i=start;
		int j=end;
		while(i<index )
		{
			if(input[i]>input[index])
			{
				while(j>index && input[j]>input[index])
				{
					j-=1;
				}
				if(i < j) {
					int t=input[i];
					input[i]=input[j];
					input[j]=t;
					i++;
					j--;
				}
			}
			else 
				i++;
		}
		return index;
	}
	public static void quickSort(int input[],int start,int end)
	{
		if(start>=end)
		{
			return;
		}
		int pivotIndex=getPivotIndex(input,start,end);
		quickSort(input,start,pivotIndex-1);
		quickSort(input,pivotIndex+1,end);
	}
	public static void main(String[] args) {
		int input[]=Ainput();
		quickSort(input,0,input.length-1);
		print(input);

	}

}
