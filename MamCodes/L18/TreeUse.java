package L18;

//import java.util.Queue;
import java.util.Scanner;
import L17.QueueUsingLL1;

public class TreeUse {
	
	public static TreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter root data : ");
		int data = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(data);
		System.out.println("Enter no. of children : ");
		int n = s.nextInt();
		for(int i = 0; i < n; i++) {
			TreeNode<Integer> child = takeInput();
			root.children.add(child);
		}
		return root;
	}
	
	public static TreeNode<Integer> takeInputLevelWise()  {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter root data : ");
		int rootData = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
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
	
	public static int height(TreeNode<Integer> root) {
		// Specail case
		if(root == null) {
			return 0;
		}
		
		int ans = 0;
		for(int i = 0; i < root.children.size(); i++) {
			TreeNode<Integer> child = root.children.get(i);
			int childHeight = height(child);
			if(childHeight > ans) {
				ans = childHeight;
			}
		}
		return ans + 1;
	}
	
	
	
	
	
	
	// 1 3 2 3 4 2 5 6 0 1 7 0 0 1 8 0
	public static void main(String[] args) {
		TreeNode<Integer> root = takeInputLevelWise();
		print(root);
	}
}
