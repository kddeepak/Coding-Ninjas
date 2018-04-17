package L21;

import java.util.ArrayList;

public class Hashmap<K, V> {
	ArrayList<MapNode<K, V>> data;
	int tableSize;
	int count;
	
	public Hashmap() {
		data = new ArrayList<MapNode<K,V>>();
		tableSize = 7;
		for(int i = 0; i < tableSize; i++) {
			data.add(null);
		}
		count = 0;
	}
	
	public void insert(K key, V value) {
		// Search if key is already presnt
		int index = key.hashCode() % tableSize;
		MapNode<K, V> head = data.get(index);
		
		while(head != null) {
			if(head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		
		// Insert new node
		MapNode<K, V> newNode = new MapNode<K, V>(key, value);
		head = data.get(index);
		newNode.next = head;
		head = newNode;
		data.set(index, head);
		count++;
		
		double loadFactor = (count * 1.0) / tableSize;
		if(loadFactor > 0.7) {
			rehashing();
		}
	}
	
	private void rehashing() {
		ArrayList<MapNode<K, V>> temp = data;
		data = new ArrayList<MapNode<K,V>>();
		for(int i = 0; i < 2*temp.size(); i++) {
			data.add(null);
		}
		
		count = 0;
		tableSize *= 2;	// Next prime number close to double the previous size
		for(MapNode<K, V> head : temp) {
			while(head != null) {
				insert(head.key, head.value);
				head = head.next;
			}
		}
	}

	public V search(K key) {
		int index = key.hashCode() % tableSize;
		MapNode<K, V> head = data.get(index);
		
		while(head != null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head = head.next;
		}
		return null;
	}
	
	public void remove(K key) {
		int index = key.hashCode() % tableSize;
		MapNode<K, V> head = data.get(index);
		MapNode<K, V> prev = null;
		
		while(head != null) {
			if(head.key.equals(key)) {
				if(prev == null) {
					data.set(index, head.next);
				}
				else {
					prev.next = head.next;
				}
				count--;
				return;
			}
			prev = head;
			head = head.next;
		}
	}
	
}
