package DynamicProg;

public class editDistance_iter {
	public static int edit_iter(String s,String t,int ans[][]) {
		
		for(int i=0;i<ans[0].length;i++)
		{
			ans[0][i]=i;
		}
		for(int i=0;i<ans.length;i++)
		{
			ans[i][0]=i;
		}
		for(int i=1;i<ans.length;i++)
		{
			for(int j=1;j<ans[0].length;j++)
			{
				if(s.charAt(i-1)==t.charAt(j-1))
				ans[i][j] =ans[i-1][j-1];
				else
				ans[i][j]=1+Math.min(ans[i-1][j-1],Math.min(ans[i-1][j],ans[i][j-1]));
			}
		}
		return ans[s.length()][t.length()];
	}
	public static void main(String[] args) {
		String s = "abshjdflkjfkls";
		String t = "abnjgkjgskgs";
		int ans[][] = new int[s.length()+1][t.length()+1];
		int x = edit_iter(s,t, ans);
		System.out.println(x);
	}
}
