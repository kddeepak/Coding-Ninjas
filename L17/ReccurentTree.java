package L17;


import java.util.*;
/*class TreeNode<T> {
	T data;
	ArrayList<TreeNode<T>> children;
	
	public TreeNode(T data) {
		this.data = data;
		children = new ArrayList<TreeNode<T>>();
	}
	
}*/
public class ReccurentTree {

    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int[] value = new int[n];
      ArrayList<TreeNode<Integer>> arr = new  ArrayList<TreeNode<Integer>>();
      for(int i=0;i<n;i++)
      {
    	  arr.add(new TreeNode<Integer>(i+1));
      }
      for(int i=0;i<n-1;i++)
      {
    	  int x = s.nextInt();
    	  int y = s.nextInt();
    	  
    	  arr.get(x-1).children.add(new TreeNode<Integer>(y));
      }
       for(int i=0;i<n;i++)
       {
    	   value[i]=s.nextInt();
       }
       
    }
}
	  