package L21;

import java.util.HashMap;
import java.util.Scanner;

public class ex1 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		
		for(int i=0;i<n;i++){
			
			HashMap<Integer,Integer> m = new HashMap<Integer,Integer>();
			for(int j=0;j<4;j++){
				int x = s.nextInt();
				
				if(m.containsKey(x)){
					int t = m.get(x);
					m.put(x,t+1);
				}
				else{
					m.put(x, 1);
				}
			}
			int cc=0;
			if(m.size()==2){
				
				for(int b : m.keySet()){
					
					if(m.get(b)!=2){
						System.out.println("NO");
						cc=1;
						break;
					}
				}
				if(cc==0)
					System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}
