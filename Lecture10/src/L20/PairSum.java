package L20;

import java.util.Scanner;

import L17.QueueUsingLL1;

/*class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}*/

public class PairSum {
	

 

 public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		//System.out.println();
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
    public static BinaryTreeNode<Integer> find(BinaryTreeNode<Integer> root, int f)
    {
        if(root==null)
            return null;
        if(root.data.equals(f))
        {
            return root;
        }
        
        BinaryTreeNode<Integer> l=find(root.left,f);
        if(l!=null)
            return l;
        BinaryTreeNode<Integer> r=find(root.right,f);
        if(r!=null)
            return r;
        return null;    
    }
	public static void nodesSumToS(BinaryTreeNode<Integer> croot,BinaryTreeNode<Integer> root, int sum) {
	    
	   if(croot==null)
	   {
	        return;
	   }
	   int s = sum-croot.data;
	 
	   BinaryTreeNode<Integer> f=null;
	   if(croot.data<s)
		   f=find(root,s);
	   if(f!=null)
	   {
	       System.out.println(croot.data+" "+f.data);
	   }
	  
	   nodesSumToS(croot.left,root,sum);
	   nodesSumToS(croot.right,root,sum);
	
	}
	
	//5 10 6 2 3 -1 -1 -1 -1 -1 9 -1 -1 
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		/* BinaryTreeNode<Integer> temp=find(root, 11);
		 if(temp!=null)
		 System.out.println(temp.data+" "+"found");
		 else
			 System.out.println("not found");*/
		nodesSumToS(root,root,11);
	}
	
}
