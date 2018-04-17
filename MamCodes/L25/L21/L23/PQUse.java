package L23;

public class PQUse {

	public static void main(String[] args) {
		PriorityQueue p = new PriorityQueue();
		
		p.insert(10);
		p.insert(1);
		p.insert(5);
		p.insert(12);
		p.insert(4);
		p.insert(8);
		
		System.out.println(p.getMin());
		p.removeMin();
		
		System.out.println(p.removeMin());
		System.out.println(p.removeMin());
		System.out.println(p.removeMin());
		System.out.println(p.removeMin());
	}
}
