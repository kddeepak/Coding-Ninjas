package DynamicProg;

public class LcsDp {
	public static int lcs_RecDP(String s, String t, int ans[][]) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		int m = s.length();
		int n = t.length();
		if(s.charAt(0) == t.charAt(0)) {
			if(ans[m-1][n-1] == -1) {
				ans[m-1][n-1] = lcs_RecDP(s.substring(1), t.substring(1), ans);
			}
			ans[m][n] = 1 + ans[m-1][n-1];
		}
		else {
			if(ans[m][n-1] == -1) {
				ans[m][n-1] = lcs_RecDP(s, t.substring(1), ans);
			}
			if(ans[m-1][n] == -1) {
				ans[m-1][n] = lcs_RecDP(s.substring(1), t, ans);
			}
			ans[m][n] = Math.max(ans[m][n-1], ans[m-1][n]);
		}
		return ans[m][n];
	}
	public static int lcs_Iter(String s, String t) {
		int ans[][] = new int[s.length() + 1][t.length() + 1];//it is not like recursion so we dont need to pass the ans array..- 
		
		for(int i = 0; i <= s.length(); i++) {
			ans[i][0] = 0;
		}
		for(int j = 0; j <= t.length(); j++) {
			ans[0][j] = 0;
		}
		int m = s.length(), n = t.length();
		for(int i = 1; i <= s.length(); i++) {
			for(int j = 1; j <= t.length(); j++) {
				if(s.charAt(i-1) == t.charAt(j-1)) {
					ans[i][j] = 1 + ans[i-1][j-1]; 
				}
				else {
					ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
				}
			}
		}
		return ans[m][n];
	}
	public static void main(String[] args) {
		
		String s="jfkdsjfjfkjrgkjklsjkgksjgopskdsjfjfkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkjrgkjklsjkgksjgopkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjglfjdagkd";
		String t="ldjfkfdanbvklfdnndfklkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjgkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjkdsjfjfkjrgkjklsjkgksjgopsglfjnlfdnjgklfdgklfdj";
		 int[][] ans= new int[s.length()+1][t.length()+1];
		 for(int i=0;i<ans.length;i++)
		 {
			 for(int j=0;j<ans[i].length;j++)
				 ans[i][j]=-1;
		 }
		 int x=lcs_Iter(s,t);
		 int y=lcs_RecDP(s,t,ans);
		 System.out.println(x);
		 System.out.println(y);
		 
	}
}
