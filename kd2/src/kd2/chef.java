package kd2;

public class chef {

	public static void chef(String s)
	{
		int min = Integer.MAX_VALUE;
		int a[] = new int[4];
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='C')
				a[0]+=1;
			else if(s.charAt(i)=='H')
				a[1]+=1;
			else if(s.charAt(i)=='E')
				a[2]+=1;
			else if(s.charAt(i)=='F')
				a[3]+=1;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		System.out.println(min);
		
	}
	public static void main(String[] args) {
	   chef("CCCHHHEEFF");
	}
}
