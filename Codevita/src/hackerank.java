import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;






public class hackerank {
	
	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int q = s.nextInt();
		
		String waste = s.nextLine();
		
		ArrayList<String> al = new ArrayList<String>();
		
		
		
		for(int i=0;i<q;i++){
			
			String S = s.nextLine();
			al.add(S);
		}
	/*	
		for(int k=0;k<al.size();k++){
			System.out.println(al.get(k));
		}
		*/
		
		int key = s.nextInt();
		String rev = s.next();
		String comp = s.next();
		
		Comparator<String> cmp = new Comparator<String>() {
			  public int compare(String o1, String o2) {
				  
				  String[] t1 = o1.split(" "); 
				
				  String[] t2 = o2.split(" ");
			    int diff =Integer.valueOf(t1[key-1])-Integer.valueOf(t2[key-1]);
			    
			     //   return (diff == 0) ? (Integer.valueOf(o2.substring(3)).compareTo(Integer.valueOf(o1.substring(3)))): diff;
			    return diff;
			  }
			};
			Comparator<String> cmp2 = new Comparator<String>() {
				  public int compare(String o1, String o2) {
					  
					  String[] t1 = o1.split(" "); 
					
					  String[] t2 = o2.split(" ");
				    int diff =(t1[key-1]).compareTo(t2[key-1]);
				    
				    //   return (diff == 0) ? (Integer.valueOf(o2.substring(3)).compareTo(Integer.valueOf(o1.substring(3)))): diff;
				   return diff;
				  }
				};
			
				if(comp.equals("lexicographic")){
			
			Collections.sort(al, cmp2);
				}
				
				if(comp.endsWith("numeric")){
					Collections.sort(al, cmp);
					
				}
			if(rev.equals("false")){
			
			for(int k=0;k<al.size();k++){
				System.out.println(al.get(k));
			}
			}
			
			if(rev.equals("true")){
				
				for(int k=al.size()-1;k>=0;k--){
					System.out.println(al.get(k));
				}
			}
			
		
	}

}
