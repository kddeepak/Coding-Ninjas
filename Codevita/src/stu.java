import java.util.HashMap;
import java.util.Scanner;

public class stu {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		for(int i=0;i<n;i++){
			HashMap<String,Integer> m = new HashMap<String,Integer>();
			int eng = s.nextInt();
			
			
			for(int j=0;j<=eng;j++){
				
				String S = s.nextLine();
				//System.out.println(S);
				m.put(S,0);
			}
			
			int x = s.nextInt();
			
			for(int k=0;k<=x;k++){
				
				String S = s.nextLine();
				
				if(m.containsKey(S)){
					
					int temp = m.get(S);
					m.put(S,temp+1);
				}
			}
			int min = Integer.MAX_VALUE;
			for(String e : m.keySet()){
				System.out.println(e+":"+m.get(e));
				if(m.get(e)<min){
					
					min=m.get(e);
				}
				
			}
			
			System.out.println("case #"+(i+1)+":"+" "+min);
		}
	}
}
