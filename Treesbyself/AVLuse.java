package Treesbyself;

public class AVLuse {
	
	  public AVLnode leftRotate(AVLnode root){
	        AVLnode newRoot = root.right;
	        root.right = root.right.left;
	        newRoot.left = root;
	        root.height = setHeight(root);
	        //root.size = setSize(root);
	        newRoot.height = setHeight(newRoot);
	        //newRoot.size = setSize(newRoot);
	        return newRoot;
	    }
	    
	    public AVLnode rightRotate(AVLnode root){
	        AVLnode newRoot = root.left;
	        root.left = root.left.right;
	        newRoot.right = root;
	        root.height = setHeight(root);
	        //root.size = setSize(root);
	        newRoot.height = setHeight(newRoot);
	       // newRoot.size = setSize(newRoot);
	        return newRoot;
	    }
	    
	    public int setHeight(AVLnode root){
        if(root == null){
            return 0;
        }
        return 1 + Math.max((root.left != null ? root.left.height : 0), (root.right != null ? root.right.height : 0));
    }
	
	
	public  int height(AVLnode root){
		
		if(root==null)
			return 0;
		else
			return root.height;
	}
	
	public  int balance(AVLnode left,AVLnode right){
		
		return height(left)-height(right);
	}
	
	public  AVLnode insert(AVLnode root,int n){
		
		if(root==null){
			AVLnode Node = new AVLnode(n);
			return Node;
		}
		
		if(root.data>n){
			
			root.left = insert(root.left,n);
		}
		else{
			root.right = insert(root.right, n);
		}
		
		int balance = balance(root.left,root.right);
		
		if(balance > 1){
            if(height(root.left.left) >= height(root.left.right)){
                root = rightRotate(root);
            }else{
                root.left = leftRotate(root.left);
                root = rightRotate(root);
            }
        }else if(balance < -1){
            if(height(root.right.right) >= height(root.right.left)){
                root = leftRotate(root);
            }else{
                root.right = rightRotate(root.right);
                root = leftRotate(root);
            }
        }
        else{
            root.height = setHeight(root);
            
        }
		
		return root;
	}

}
