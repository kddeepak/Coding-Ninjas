package L17;

import java.util.Scanner;

//import java.util.ArrayList;


public class ZigZag {
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
	
    	public static Node<BinaryTreeNode<Integer>> reverse_R(Node<BinaryTreeNode<Integer>> head) {
		if(head.next==null)
		{
		    return head;
		}
		Node<BinaryTreeNode<Integer>> temp = reverse_R(head.next);
		Node<BinaryTreeNode<Integer>> t = temp;
		while(temp.next!=null)
		{
		    temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		
		return t;
	}

	
	 public static void main(String[] args) {
		 BinaryTreeNode<Integer> root = takeInputLevelWise();
		 printZigZag(root);
	}
	
	 

	public static void printZigZag(BinaryTreeNode<Integer> root) {
		

	QueueUsingLL1<BinaryTreeNode<Integer>> q = new QueueUsingLL1<BinaryTreeNode<Integer>>();	
	
	 int count=-1;
	 int c=0;
	 Node<BinaryTreeNode<Integer>> head = null;
	 Node<BinaryTreeNode<Integer>> tail = null;
	 
	 BinaryTreeNode<Integer> nul = null;
	 q.enqueue(root);
	 q.enqueue(nul);
	 while(!q.isEmpty())
	 {
	  
	   BinaryTreeNode<Integer> current = q.dequeue();
	  
	   if(current!=null)
	   {
	       count=1;
	       if(current.right!=null)
	        q.enqueue(current.right);
	       if(current.left!=null)
	        q.enqueue(current.left);
	       Node<BinaryTreeNode<Integer>> newnode = new Node<BinaryTreeNode<Integer>>(current);
	       if(tail==null)
	       {
	           head=newnode;
	           tail=newnode;
	       }
	       else
	       {
	           tail.next=newnode;
	           tail=newnode;
	       }
	      
	      
	   }
	   else
	   {
		   if(count==0)
	       {
	           break;
	       }
	       count=0;
	       q.enqueue(nul);
	       if(c%2==0)
	       {
	       head=reverse_R(head);
	       while(head!=null)
	       {
	           System.out.print(head.data.data+" ");
	           head=head.next;
	       }
	       System.out.println();
	       //System.out.println();
	       
	       }
	       else
	       {
	        while(head!=null)
	       {
	           System.out.print(head.data.data+" ");
	           head=head.next;
	       }
	       System.out.println();
	       
	       
	       }
	       head=null;
	       tail=null;
	       
	       c+=1;
	   }
	   
	  
	 }


	}


}
