import java.util.HashMap;
import java.util.Scanner;

public class demo {

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		HashMap<String,Integer> m = new HashMap<String,Integer>();
		int n = s.nextInt();
		
		for(int i=0;i<n;i++){
			//String x = s.nextLine();
			//int a = s.nextInt();
			m.put(s.next(),s.nextInt());
		}
		
		System.out.println(m);
	}
}
