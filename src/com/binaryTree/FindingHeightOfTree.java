package com.binaryTree;

public class FindingHeightOfTree {
	static int size=0;
	static int maxValue=Integer.MIN_VALUE;
	Node root;
	public static void main(String[] args) {
		FindingHeightOfTree tree=new FindingHeightOfTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.left.left = new Node(4);
		tree.root.right.left = new Node(6);
		tree.root.right.right= new Node(7);
		System.out.println(FindingHeightOfTree.height(tree.root, tree.root));;
	}
	
	static int height(Node root, Node rootFix) {
	/*	size=size+1;
		if(root==rootFix) {
			if(size>maxValue) {
				maxValue=size;
				size=0;
			}
		}*/
		if(root==null)
			return 0; 
		int leftv = 0;
		int rightv=0;
		if(root.left!=null)
			leftv=height(root.left, rootFix);
		//if(root.right!=null)
			rightv=height(root.right, rootFix);
		
		return (leftv>rightv)?leftv+1:rightv+1;
	}

}
