import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class lexographic_subsequence {
	
	public static String lexo(String s,int k)
	{
		int carr[] = new int[26];
		for(int i=0;i<s.length();i++)
		{
			carr[(int)(s.charAt(i))-97]+=1;
		}
		HashMap<Character,ArrayList<Integer>> m = new HashMap<Character,ArrayList<Integer>>();
		for(int i=0;i<s.length();i++)
		{
				if(m.containsKey(s.charAt(i))==false)
				{
					ArrayList<Integer> a = new ArrayList<Integer>();
					a.add(i);
					m.put(s.charAt(i), a);
				}
				else
				{
					ArrayList<Integer> a = m.get(s.charAt(i));
					a.add(i);
					m.put(s.charAt(i), a);
				}
		}
		String nw ="";
		int count=0;
		int cur=0;
		for(int i=25;i>=0;i--)
		{
			if(carr[i]>=k && count==0)
			{
				for(int j=0;j<carr[i];j++)
					nw+=(char)(97+i);
				count+=1;
				cur=i;
			}
			else
			{
				if(carr[i]>=k )
				{
					int c=0;
					ArrayList<Integer>aaa =m.get((char)(97+i));
					ArrayList<Integer>b =m.get((char)(97+cur));
					int bc = b.get(b.size()-1);
					for(int m1=0;m1<aaa.size();m1++)
					{
						if(aaa.get(m1)>bc)
						{
							c++;
						}
					}
					if(c>=k)
					{
						for(int j=0;j<c;j++)
						{
							nw+=(char)(97+i);
						}
						cur=i;	
					}
					
				}
			}
			if((char)(97+i)==s.charAt(s.length()-1))
				break;
		}
		return nw;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String S = s.nextLine();
		String ans = lexo(S,1);
		System.out.println(ans);
	}

}
