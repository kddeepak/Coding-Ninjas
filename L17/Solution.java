 
package L17;

import java.util.ArrayList;
import java.util.Scanner;
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;

	public BinaryTreeNode(T data) {
		this.data = data;
	}
}


public class Solution {
	public static BinaryTreeNode<Integer> takeInputLevelWise()  {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);

		QueueUsingLL1<BinaryTreeNode<Integer>> q = new QueueUsingLL1<BinaryTreeNode<Integer>>();
		q.enqueue(root);
		while(!q.isEmpty()) {
			BinaryTreeNode<Integer> current = q.dequeue();
			int leftData = s.nextInt();
			if(leftData != -1) {
				BinaryTreeNode<Integer> left = new BinaryTreeNode<Integer>(leftData);
				current.left = left;
				q.enqueue(left);
			}
			int rightData = s.nextInt();
			if(rightData != -1) {
				BinaryTreeNode<Integer> right = new BinaryTreeNode<Integer>(rightData);
				current.right = right;
				q.enqueue(right);
			}
		}
		return root;

	}
	
public static void main(String[] args) {
	BinaryTreeNode<Integer> root = takeInputLevelWise();
	ArrayList<Node<BinaryTreeNode<Integer>>> al =  LLForEachLevel(root);
	for(int p=0;p<al.size();p++) {
        Node<BinaryTreeNode<Integer>> thenewnode = al.get(p);
        while(thenewnode!=null) {
            System.out.print(thenewnode.data.data+" ");
            thenewnode=thenewnode.next;
            
        }
        System.out.println();
    }
    System.out.println("my part is done!");
}
	
	
	
	

	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
	QueueUsingLL1<BinaryTreeNode<Integer>> q = new QueueUsingLL1<BinaryTreeNode<Integer>>();	
	ArrayList<Node<BinaryTreeNode<Integer>>> al = new ArrayList<Node<BinaryTreeNode<Integer>>>();
	 int count=-1;
	 //Node<BinaryTreeNode<Integer>> temp = null;
	  Node<BinaryTreeNode<Integer>> t =null ;
	   Node<BinaryTreeNode<Integer>> head =null ;
	    Node<BinaryTreeNode<Integer>> tail =null ;
	 BinaryTreeNode<Integer> nul = null;
	 
	 q.enqueue(root);
	 q.enqueue(nul);
	 //Node<BinaryTreeNode<Integer>> h = new Node<BinaryTreeNode<Integer>>(root) ;
	 //al.add(h);
	 
	 while(!q.isEmpty())
	 {
	  
	   BinaryTreeNode<Integer> current = q.dequeue();
	   
	   if(current!=null)
	   {
	       count=1;
	       if(current.left!=null)
	        q.enqueue(current.left);
	       if(current.right!=null) 
	        q.enqueue(current.right);
	       Node<BinaryTreeNode<Integer>> newnode =new Node<BinaryTreeNode<Integer>>(current) ;
	       if(tail==null)
	       {
	            tail=newnode;
	            head=newnode;
	       }
	       else
	        {
	         tail.next=newnode;
	         tail=newnode;
	        }
	       
	       
	   }
	   else
	   {
	     q.enqueue(nul);

	     al.add(head);
	     
	     head=null;
	     tail=null;
	    
	     if(count==0)
	        break;
	   
	     count=0;     
	   }
	  
	 }	
		
    return al;
	}


}
