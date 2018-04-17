package L19;

import java.util.Scanner;

import L18.QueueEmptyException;
import L18.QueueUsingLL;

class Pair {
	int diameter;
	int height;
	Pair(int h, int d) {
		height = h;
		diameter = d;
	}
}


public class BinaryTreeUse {

	public static BinaryTreeNode<Integer> takeInput() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);
		root.left = takeInput();
		root.right = takeInput();

		return root;
	}


	public static BinaryTreeNode<Integer> takeInputLevelWise() throws QueueEmptyException {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter root data : ");
		int data = s.nextInt();
		if(data == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(data);

		QueueUsingLL<BinaryTreeNode<Integer>> q = new QueueUsingLL<BinaryTreeNode<Integer>>();
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

	public static void print(BinaryTreeNode<Integer> root) {
		// Base case
		if(root == null) {
			return;
		}
		System.out.print(root.data + " : ");
		if(root.left != null) {
			System.out.print(root.left.data);
		}
		System.out.print(", ");
		if(root.right != null) {
			System.out.print(root.right.data);
		}
		System.out.println();

		print(root.left);
		print(root.right);
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return Math.max(lh, rh) + 1;
	}

	public static int diameter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return 0;
		}
		
		int d1 = height(root.left) + height(root.right) + 1;
		int d2 = diameter(root.left);
		int d3 = diameter(root.right);
		
		return Math.max(d1, Math.max(d2, d3));
	}
	
	public static Pair diameterBetter(BinaryTreeNode<Integer> root) {
		if(root == null) {
			Pair ans = new Pair(0, 0);
			return ans;
		}
		
		Pair left = diameterBetter(root.left);
		Pair right = diameterBetter(root.right);
		
		int ansHeight, ansDiameter;
		ansHeight = Math.max(left.height, right.height) + 1;
		ansDiameter = Math.max(left.diameter,
				Math.max(right.diameter, 
						left.height + right.height + 1));
		
		
		Pair ans = new Pair(ansHeight, ansDiameter);
		return ans;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) throws QueueEmptyException {
		BinaryTreeNode<Integer> root = takeInputLevelWise();
	
		print(root);
	
	}
	
	
	
	




}
