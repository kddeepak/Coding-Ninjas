package L21;

public class HashUse {

	public static void main(String[] args) {
		MyHashMap<String, Integer> map = new MyHashMap<String,Integer>(5);
		
	
		
		map.insert("deepak",10);
		System.out.println(map.data.size());
		map.insert("dee",1);
		System.out.println(map.data.size());
		map.insert("deeak",2);
		System.out.println(map.data.size());
		map.insert("d",3);
		System.out.println(map.data.size());
		map.insert("k",4);
		
		System.out.println(map.data.size());
		map.remove("deepak");
		System.out.println(map.data.size());
		System.out.println(map.count);
		/*for(int i=0;i<map.data.size();i++)
		{
			System.out.println(map.data.get(i));
		}*/
		System.out.println(map.search("deeak"));
		System.out.println(map.search("k"));
	}

}