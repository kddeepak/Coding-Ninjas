package L14;

public class Test2 {

	public static boolean splitArray(int input[], int si, 
			int lsum, int rsum) {
		if(si == input.length) {
			return lsum == rsum;
		}
		
		if(input[si] % 5 == 0) {
			return splitArray(input, si + 1, lsum + input[si], 
					rsum);
		}
		else if(input[si] % 3 == 0) {
			return splitArray(input, si+1, lsum, rsum + input[si]);
		}
		else {
			boolean a = splitArray(input, si + 1, lsum + input[si], rsum);
			boolean b = splitArray(input, si+1, lsum, rsum + input[si]);
			return a || b;
		}
	}
}
