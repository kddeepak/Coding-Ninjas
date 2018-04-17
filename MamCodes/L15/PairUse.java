package L15;

public class PairUse {

	public static void main(String[] args) {
		PairDouble p1 = new PairDouble(19.2, 18.3);
		
		/*PairGeneric<Integer> p2 = new PairGeneric<Integer>();
		
		PairGeneric<Double> p3 = new PairGeneric<Double>();
		
		PairGeneric<Character> p4 = new PairGeneric<Character>();
		p4.x = 'A';
		
		PairGeneric<Student> p5 = new PairGeneric<Student>();
		p5.x.name = "abc";*/
		
		
		PairGeneric<Integer, Double> p2 =
				new PairGeneric<Integer, Double>();
		
	
		PairGeneric<PairGeneric<Integer, Integer>, Double> p3 = 
				new PairGeneric<PairGeneric<Integer,Integer>, Double>();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
