package L21;

import java.util.ArrayList;

public class MyHashMap<K,V> {

	ArrayList<HashNode<K, V>> data;
	int tableSize;
	int count=0;
	
	public MyHashMap(int tableSize) {
		this.tableSize = tableSize;
		data = new ArrayList<HashNode<K, V>>();
		for(int i = 0 ; i < tableSize ; i ++){
			data.add(null);
		}
	}

	
	

	public void remove(K key){
		int index = Math.abs(key.hashCode()%tableSize);
		HashNode<K, V> head = data.get(index);
		HashNode<K, V> prev = null;

		while(head!=null){
			if(head.key.equals(key)){
				if(prev==null){
					head=head.next;
					data.set(index, head);
				}
				else{
					prev.next=head.next;
					
				}
				count--;
				return;
			}
			prev=head;
			head=head.next;
		}
	}

	public V search(K key){
		int index = Math.abs(key.hashCode()%tableSize);
		HashNode<K, V> head = data.get(index);
		while(head!=null){
			if(head.key.equals(key)){
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	
	
	public void insert(K key ,V value)
	{
		int index = Math.abs(key.hashCode()%tableSize);
		HashNode<K, V> head = data.get(index);
		HashNode<K, V> temp = head;
		
		
		while(head!=null){
			//if same key found then update/overwrite it.
			if(head.key.equals(key)){
				head.value=value;
				return ;
			}
			head=head.next;
		}
		
		head= temp;
		HashNode<K, V> newNode = new HashNode<K, V>(key, value);
		newNode.next =head;
		head= newNode;
		data.set(index,head);
		count++;
				
		double loadFactor = (count)*1.0/tableSize;
		if(loadFactor>0.7)
		{
			rehasing();
		}
		
	}
	public void rehasing()//when the table get full then we need to increase the size of the table....
	{
		
		ArrayList<HashNode<K, V>> temp =data;
		data= new ArrayList<HashNode<K, V>>();
		for(int i=0;i<2*temp.size();i++)
		{
			data.add(null);
		}
		count=0;
		tableSize=tableSize*2;
		for(int i =0;i<temp.size();i++)
		{
			HashNode<K, V> head = temp.get(i);
			while(head!=null)
			{
				insert(head.key,head.value);
				head=head.next;
			}
		}
		
	}

}