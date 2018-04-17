package DynamicProg;

public class EditDistance {

	public static int  editDistance(String s,String t) {
		
		if(s.length() == 0 || t.length()==0)
		{
			return Math.max(s.length(), t.length());
		}
		
		if(s.charAt(0)==t.charAt(0))
		{
			return editDistance(s.substring(1), t.substring(1));
		}
		
		else
		{
			int a = editDistance(s.substring(1), t);//insert
			int b = editDistance(s, t.substring(1));//delete
			int c = editDistance(s.substring(1), t.substring(1));//edit
			//System.out.println(a+" "+b+" "+c);
			return 1+Math.min(a,Math.min(b, c));
		}
	}
	public static void main(String[] args) {
		int x = editDistance("a", "b");
		System.out.println(x);
	}
}
