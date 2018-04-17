//Queue using linked list concepts......	
package L17;

//import L15.Node;
class Node<T> {
	public T data;
	public Node<T> next;
	
	public Node(T data) {
		this.data = data;
		next = null;
	}
}


public class QueueUsingLL1<T> {
	
	private int size;
	private Node<T> frontIndex,nextIndex;
	
	public QueueUsingLL1()
	{
		frontIndex=null;
		nextIndex=null;
		size=0;
	}
	public void enqueue(T data)
	{
		Node<T> temp = new Node<T>(data);
		if(frontIndex==null && nextIndex==null )
		{
			frontIndex=temp;
			nextIndex=temp;
			size+=1;
		}
		else
		{
			frontIndex.next=temp;
			frontIndex=temp;
			size+=1;
		}
	}
	public T dequeue()
	{
		T temp = nextIndex.data;
		if(nextIndex==frontIndex)
		{
			nextIndex=null;
			frontIndex=null;
			size-=1;
			return temp;
		}
		else
		{
			nextIndex=nextIndex.next;
			size-=1;
			return temp;	
		}
		
	}
	public int getSize()
	{
		return size;
	}
	public boolean isEmpty()
	{
		return size==0;
	}
	

}
