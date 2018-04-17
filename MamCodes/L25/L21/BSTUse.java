package L21;

import L19.BinaryTreeNode;
//check bst using pair class...similar are diameter and second largest....

class BST {
	boolean isBST;
	int min;
	int max;
	
	BST(boolean ans, int max, int min) {
		isBST = ans;
		this.max = max;
		this.min = min;
	}
}

public class BSTUse {

	public static BST checkBST(BinaryTreeNode<Integer> root) {
		if(root == null) {
			BST ans = new BST(true, Integer.MIN_VALUE, Integer.MAX_VALUE);
			return ans;
		}
		
		BST leftAns = checkBST(root.left);
		BST rightAns = checkBST(root.right);
		boolean ans = false;
		if(leftAns.isBST && rightAns.isBST && 
				root.data > leftAns.max && root.data < rightAns.min) {
			ans = true;
		}
		int max = Math.max(leftAns.max, Math.max(rightAns.max, root.data));
		int min = Math.min(leftAns.min, Math.min(rightAns.min, root.data));
		
		BST output = new BST(ans, max, min);
		return output;
	}
	
	// Duplicates = left
	public static boolean checkBST_2(BinaryTreeNode<Integer> root, int min, int max) {
		if(root == null) {
			return true;
		}
		if(root.data < min || root.data >= max) {
			return false;
		}
		
		return checkBST_2(root.left, min, root.data) && 
				checkBST_2(root.right, root.data, max);
	}
	
	
	public static void main(String[] args) {
		
	}
}
