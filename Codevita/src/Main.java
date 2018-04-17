import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
			
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long q = s.nextLong();
		
		
		for(long i=0;i<q;i++){
			
			HashMap<Long,Long> m = new HashMap<Long,Long>();
			ArrayList<Long> al = new ArrayList<Long>();
			int n = s.nextInt();
			
			long a[] = new long[n];
			long b[] = new long[n];
			
			for(int j=0;j<n;j++){
				a[j]=s.nextLong();
				
			}
			for(int j=0;j<n;j++){
				b[j]=s.nextLong();
				long v = a[j]%b[j];
				if(!m.containsKey(v)){
					m.put(v,1l);
				}
				else{
					long temp = m.get(v);
					m.put(v, temp+1);
				}
				
			}
			long max = Long.MIN_VALUE;
			for(long z : m.keySet()){
			//	System.out.println(m.get(z));
				if(m.get(z)>max){
					max=m.get(z);
				}
			}
			for(long z : m.keySet()){
				
				if(m.get(z)==max){
					al.add(z);
				}
			}
			
			//System.out.println(al.get(0));
			long sum=0;
			long mmm = Long.MAX_VALUE;
			for(int y=0;y<al.size();y++){
				
				for(int w=0;w<n;w++){
					if(a[w]%b[w]!=al.get(y)){
					
					if(a[w]<b[w]){
						if(a[w]<al.get(y)){
						sum+=al.get(y)-a[w];
						}
						else{
							sum+=b[w]-a[w]+al.get(y);
						}
						
						
					}
					else if(a[w]>b[w]){
						sum+=al.get(y)-(a[w]%b[w]);
					}
					else{
						sum+=al.get(y);
					}
					
					}
				}
			//	System.out.println(sum);
				if(sum<mmm){
					mmm=sum;
					
				}
				sum=0;
			}
			
			System.out.println(mmm);
			
		}
		
	}
}
