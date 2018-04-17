package L20;

import java.util.Scanner;

import L17.QueueUsingLL1;
class BinaryTreeNode<T> {
	T data;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data) {
		this.data = data;
	}
}


public class BstSearch {
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
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

	
	public static boolean find(BinaryTreeNode<Integer> root,int x)
	{
		if(root==null)
		{
			return false;
		}
		if(root.data==x)
		{
			return true;
		}
		boolean left,right;
		if(x<root.data)
		{
			 left = find(root.left,x);
			 if(left==true)
				 return true;
		}
		if(x>root.data)
		{
			 right= find(root.right,x);
			 if(right==true)
				 return true;
		}
		return false;
		
	}
	public static int great(BinaryTreeNode<Integer> root,int x)
	{
	    if(root==null)
	    {
	        return 0;
	    }
	    int l = great(root.left,x);
	    int r = great(root.right,x);
	    if(root.data>=x)
	    {
	        return l+r+root.data;
	    }
	    else
	    {
	        return l+r;
	    }
	}
	public static void main(String[] args) {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		/*boolean ans = find(root,7);
		System.out.println(ans);*/
		int t = great(root,5);
		System.out.println(t);
		
	}
	

}