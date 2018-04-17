package L21;

import java.util.*;

public class Solution {
	public static int[] input()
	{
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int input[] = new int[n];
		for(int i=0;i<n;i++)
		{
			int x = s.nextInt();
			input[i]=x;
		}
		return input;
	}
	/*public static void PairSum(int[] input, int size) {
		
	HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
	for(int i:input)
	{
	  if(m.containsKey(i)==false)
	  {
	      m.put(i,1);
	  }
	  else
	  {
	      int freq=m.get(i);
	      m.put(i,freq+1);
	  }
	}
	
	for(int i :input)
	{
	   if(m.containsKey(-i) && m.get(i)>0)
	   {
		   for(int j=0;j<m.get(i)*m.get(-i);j++)
		   {
			   if(i<-i)
			   System.out.println(i+" "+-i);
			   else
				   System.out.println(-i+" "+i);
		   }
		   m.put(i, 0);
		   m.put(-i, 0);
	   }
	}
	}*/
	public static void findPairsDifferenceK(int[] input, int k){
        HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
        
        for(int i: input)
        {
            if(!m.containsKey(i))
                m.put(i,1);
            else
            {
                int f = m.get(i);
                m.put(i,f+1);
            }
        }
        for(int i : input)
        {
            if(m.get(i)!=0)
        	{
            if(m.containsKey(i+k))
            {
                for(int j=0;j<m.get(i)*m.get(i+k);j++)
                     System.out.println((i)+" "+(i+k));
            }
            if(m.containsKey(i-k))
            {
                for(int j=0;j<m.get(i)*m.get(i-k);j++)
                     System.out.println((i-k)+" "+i);
            }
            m.put(i,0);
        	}
        }
            
	}
	
   
	public static void main(String[] args) {
		int arr[] = input();
		findPairsDifferenceK(arr, 183);
	}
}