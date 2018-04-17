package L21;

public class MapUse {

	public static void main(String[] args) {
		Hashmap<String, Integer> m = new Hashmap<String, Integer>();
		
		
		m.insert("abc", 10);
		m.insert("def", 20);
		m.insert("ghi", 30);
		m.insert("xyz", 40);
		m.insert("def", 200);
		
		System.out.println(m.search("def"));
		m.remove("def");
		System.out.println(m.search("def"));
		
		
		
		
		
		
		
		
		
		
		
	}
}
