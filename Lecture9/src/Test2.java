import java.util.Scanner;

public class Test2{
	
	public static int Search(int input[],int element ,int start,int end)
	{
		int index=0;
	   if(start>end)
	   {
	       return -1;
	   }
	   int mid=(start+end)/2;
	   if(input[mid]==element)
	   {
	       return mid;
	   }
	   else if(input[mid]<element)
	   {
	   index=Search(input,element,mid+1,end);
	   
	   }
	   else if(input[mid]>element)
	    {
	    index=Search(input,element,start,mid-1);
	   
	   }
	  return index;
	}
	public static int binarySearch(int input[], int element) {
	    
		return Search(input,element,0,input.length-1);

	}

		
	public static void printArray(int input[])
	{
		for(int i=0;i<input.length;i++)
		{
			System.out.print(input[i]+" ");
		}
	}
	public static int[] takeInput(){//fuction return integer array
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
		{
			
			input[i]=s.nextInt();
			
		}
		return input;
	}
	public static void main(String[] args) {
		int input[] =takeInput();
		int z=binarySearch(input,8);
		System.out.println(z);
		
		
	}
		
	}



