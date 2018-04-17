package L15;

import java.util.Scanner;

public class LinkedList {

	// O(n^2)
	public static Node<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null;
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
			}
			else {
//				head.next = newNode;
				Node<Integer> temp = head;
				while(temp.next != null) {
					temp = temp.next;
				}
				temp.next = newNode;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	// O(n)
	public static Node<Integer> takeInputBetter() {
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
		Node<Integer> head = null, tail = null;
		while(data != -1) {
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
//				tail = tail.next;
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void print(Node<Integer> head) {
		Node<Integer> temp = head;
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
		
		head = temp;
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		Node<Integer> head = takeInput();
		Node<Integer> h = nextLargeNumber(head);
		print(h);

	}
	
	
	public static LinkedListNode<Integer> nextLargeNumber(Node<Integer> head) {
	    Node<Integer> temp = head;
	     Node<Integer> t = head;
	    Stack<Integer> s = new Stack<Integer>();
	    int sum=0;
	    int l=0;
	    int fl=0;
	    int f =0;
	    while(temp!=null)
	    {
	        sum=(sum*10)+temp.data;
	        l+=1;
	        temp=temp.next;
	    }
	    f=sum+1;
	    //int t=f;
	    while(f!=0)
	    {
	        s.push(f%10);
	        f=f/10;
	        fl+=1;
	    }
	    
	    if(fl==l)
	    {
	        while(t!=null)
	        {
	            t.data=s.pop();
	        }
	    }
	    else
	    {
	       Node<Integer> n = new Node<Integer>(s.pop());
	        
	        n.next=head;
	        head=n;
	        t=head.next;
	        while(t!=null)
	        {
	            t.data=s.pop();
	        }
	    }
	    return head;
		}



	
	
	
	
	
	
	
	


}
