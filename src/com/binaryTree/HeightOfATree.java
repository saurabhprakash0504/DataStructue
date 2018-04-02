package com.binaryTree;

public class HeightOfATree {

	Node root;

	public static void main(String[] args) {
		InsertingNodeInTree tree = new InsertingNodeInTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.left.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);
		tree.root.right.right.left = new Node(4);
		tree.root.right.right.left.left = new Node(14);
		System.out.println(HeightOfATree.height(tree.root));
		// printing(tree.root);
	}
	static int leight=0;
	static int rheight=0;
	static int height=0;
/*	private static int height(Node root2) {
		
		
		if (root2==null)
			return 0;
		else {
			
			if(root2.left!=null) {
				leight=leight+1;
				height(root2.left);
			}
			
			
			if((root2.right)!=null) {
				rheight=rheight+1;
				height(root2.right);
			}
			
			
			if(leight>rheight)
				height=leight;
			if(rheight>leight)
				height=rheight;
			
		}
		return height;	
	}*/
	
	
	private static int height(Node root2) {
		if(root2==null)
			return 0;
		int left=height(root2.left);
		int right=height(root2.right);
		return (left>right)?left+1:right+1;
	}
}
