package L20;

import java.util.ArrayList;
import java.util.Scanner;

import L17.QueueUsingLL1;

class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;

	TreeNode(T data){
		this.data = data;
		children = new ArrayList<TreeNode<T>>();
	}
}

public class MaxSumChild {
	public static ArrayList<BinaryTreeNode<Integer>> a = new ArrayList<BinaryTreeNode<Integer>>();
	
	public static QueueUsingLL1<Integer> b =  new QueueUsingLL1<Integer>();
	
    public static void inorder(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        a.add(root);
        inorder(root.right);
        
    }
    public static  void putinorder(BinaryTreeNode<Integer> root) {
    	if(root==null)
    		return;
    	putinorder(root.left);
    	root.data=b.dequeue();
    	putinorder(root.right);
	}
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
	    inorder(root);
		int sum=0;
		for(int i=0;i<a.size();i++)
		{
			sum=a.get(i).data;
		}
		int value=sum;
		for(int i=0;i<a.size();i++)
		{
			
			b.enqueue(value);
			value=value-a.get(i).data;
			
		}
		putinorder(root);
	}
	public static TreeNode<Integer> takeInputLevelWise()  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL1<TreeNode<Integer>> q = new QueueUsingLL1<TreeNode<Integer>>();
		q.enqueue(root);
		
		while(!q.isEmpty()) {
			TreeNode<Integer> current = q.dequeue();
			System.out.println("Enter number of children for " + 
					current.data + " : ");
			int n = s.nextInt();
			for(int i = 0; i < n; i++) {
				int childData = s.nextInt();
				TreeNode<Integer> child = new TreeNode<Integer>(childData);
				q.enqueue(child);
				current.children.add(child);
			}
		}
		return root;
	}

 
 
	

public static void print(TreeNode<Integer> root) {
	// small calculation
	System.out.print(root.data + " : ");
	for(int i = 0; i < root.children.size(); i++) {
		TreeNode<Integer> child = root.children.get(i);
		System.out.print(child.data + ", ");
	}
	System.out.println();
	
	// Recursive call to print the child and its nodes...
	for(int i = 0; i < root.children.size(); i++) {
		TreeNode<Integer> child = root.children.get(i);
		print(child);
	}
}

public static void main(String[] args) {
	TreeNode<Integer> root = takeInputLevelWise();
	int temp =great(root,5);
	System.out.println(temp);
}
		
}
