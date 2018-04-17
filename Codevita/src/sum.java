
class Sum<K>{
	
	K first;
	
	public Sum(K a){
		first = a;
		
	}
	
}

public class sum{
	
	public static void main(String[] args) {
		
		Sum<Integer> s= new Sum<Integer>(2);
		Sum<Integer> b= new Sum<Integer>(3);
		System.out.println(s.first+b.first);
	}
}
