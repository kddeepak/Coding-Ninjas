package Graphs;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Comparator;

//node class is the basic structure of each node present in the huffman - tree.
/*class HuffmanNode {

	int data;
	char c;
	HuffmanNode left;
	HuffmanNode right;


}*/

//comparator class helps to compare the node on the basis of one of its attribute.
//here we will be compare on the basis of data values of the nodes.
class MyComparator implements Comparator<HuffmanNode>
{
	public int compare( HuffmanNode x, HuffmanNode y )
	{
		return x.data - y.data;
	}


}

public class Huffman {

	// recursive function to print the huffman-code through the tree traversal.
	//here s is the huffman - code generated.
	public static void printCode(HuffmanNode root,String s){
		//base case 
		//if the left and right are null then its a leaf node and we print the code s generated by traversing the tree.
		if(root.left==null && root.right==null && Character.isLetter(root.c)){//c is the character in the node
			System.out.println(root.c+":"+s);
			return;
		}


		//if we go to left then add "0" to the code.
		//if we go to the right add"1" to the code.


		//recursive calls for left and right sub-tree of the generated tree.
		printCode(root.left,s+"0");
		printCode(root.right,s+"1");
	}


	//main function
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();//number of characters to be taken as input.
		//creating a priority queue q.
		PriorityQueue<HuffmanNode> q = new PriorityQueue<HuffmanNode>(n,new MyComparator());//makes a min-priority queue(min-heap).


		for(int i=0;i<n;i++){
			HuffmanNode hn = new HuffmanNode();//creating a huffman node object and adding it to the priority-queue.
			hn.c = s.next().charAt(0);
			hn.data=s.nextInt();
			hn.left=null;
			hn.right=null;

			q.add(hn);//add functions adds the huffman node to the queue.
		}

		//create a root node 
		HuffmanNode root = null;


		//here we will extract the two minimum value from the heap each time until its size reduces to 1.
		//extract until all the nodes are extracted.
		while(q.size()>1){

			HuffmanNode x = q.peek();//first min extract.
			q.poll();
			HuffmanNode y = q.peek();//second min extarct.
			q.poll();


			HuffmanNode f = new HuffmanNode();//new node f which is equal to the sum of the frequency of the two nodes.
			//assigning values to the f node.
			f.data = x.data+y.data;
			f.c='-';
			f.left=x;//first extracted node as left child.
			f.right=y;//second extracted node as the right child.

			root=f;//marking the f node as the root node.

			q.add(f);//add this node to the priority-queue.
		}

		printCode(root, "");//print the codes by traversing the tree .
	}

}

//input format
//first line is the number of characters
//each following line will have character and its frequency separated by space.
/*6
a 5
b 9
c 12
d 13
e 16
f 45*/