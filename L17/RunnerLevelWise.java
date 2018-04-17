package L17;

import java.util.ArrayList;
import java.util.Scanner;

public class RunnerLevelWise extends Solution {
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
public static void main(String[] args) {
	BinaryTreeNode<Integer> root = takeInputLevelWise();
	ArrayList<Node<BinaryTreeNode<Integer>>> al =  LLForEachLevel(root);
}

}
