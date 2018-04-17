package L16;

import L15.Node;

public class StackUsingLL<T> {
	
	private Node<T> head;

	private int count;
	
	public StackUsingLL()
	{
		head=null;
		//size=0;
		count=0;
	}
	public boolean isEmpty()
	{
		if(head==null)
		{
			return true;
		}
		return false;
	}
	
	public int getSize()
	{
		return count;
	}
	public T top()
	{
		return head.data;
	}
	public void push(T element)
	{
		Node<T> temp = new Node<T>(element);
		temp.next=head;
		head=temp;
		count++;
		
	}
	public T pop()
	{
		Integer i=0;
		if(count==0)
		{
			EmptyStck d = new EmptyStck();
			try {
				throw d;
			} catch (Exception e) {

				System.out.println("stack to khali hai yaar ");
				return null;
			}
			
		}
		else
		{
		count--;
		T temp= head.data;
		head=head.next;
		return temp;
		}
		
	}

}
