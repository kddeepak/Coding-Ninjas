package L25;


//pehle dp vale file coding ninja folder me hi hai cant import...////
public class DP {

	public static int lcs_Iter(String s, String t) {
		int ans[][] = new int[s.length() + 1][t.length() + 1];
		
		for(int i = 0; i <= s.length(); i++) {
			ans[i][0] = 0;
		}
		for(int j = 0; j <= t.length(); j++) {
			ans[0][j] = 0;
		}
		//int m = s.length(), n = t.length();
		for(int i = 1; i <= s.length(); i++) {
			for(int j = 1; j <= t.length(); j++) {
				if(s.charAt(i) == t.charAt(j)) {
					ans[i][j] = 1 + ans[i-1][j-1]; 
				}
				else {
					ans[i][j] = Math.max(ans[i-1][j], ans[i][j-1]);
				}
			}
		}
		return ans[m][n];
	}
	
	public static int lcs(String s, String t) {
		if(s.length() == 0 || t.length() == 0) {
			return 0;
		}
		if(s.charAt(0) == t.charAt(0)) {
			return 1 + lcs(s.substring(1), t.substring(1));
		}
		else {
			int a = lcs(s, t.substring(1));
			int b = lcs(s.substring(1), t);
			return Math.max(a, b);
		}
	}
	
	public static int editDistance(String s, String t) {
		if(s.length() == 0 || t.length() == 0) {
			return Math.max(s.length(), t.length());
		}
		
		if(s.charAt(0) == t.charAt(0)) {
			return editDistance(s.substring(1), t.substring(1));
		}
		else {
			int a = editDistance(s.substring(1), t);	// Insert
			int b = editDistance(s, t.substring(1));	// Delete
			int c = editDistance(s.substring(1), t.substring(1));	// Replace
			return 1 + Math.min(a, Math.min(b, c));
		}
	}
	
	// startIndx = 0, min = Integer.MIN_VALUE
	public static int LIS(int input[], int startIndex, int min) {
		if(startIndex == input.length) {
			return 0;
		}
		int lisWithoutFirst = LIS(input, startIndex + 1, min);
		
		int lisWithFirst = Integer.MIN_VALUE;
		if(input[startIndex] > min) {
			lisWithFirst = LIS(input, startIndex + 1, 
					input[startIndex]);
		}
		return Math.max(lisWithoutFirst, lisWithFirst + 1); 
	}
	
	
	public static void main(String[] args) {
		int a[] = {5, 3, 8, 1, 10, 6, 20};
		
		System.out.println(LIS(a, 0, Integer.MIN_VALUE));
//		String s = "abcddhfudhfabcddhfudhfabcddhfudhfabcddhfudh"
//				+ "fabcddhfudhfabcddhfudhfabcddhfudhfabcddhfud"
//				+ "hfabcddhfudhf";
//		String t = "xdacdnkdnkfxdacdnkdnkfxdacdnkdnkf";
//		System.out.println(lcs_Iter(s, t));
//		System.out.println(lcs(s, t));
	}
	
	
	
	
}
