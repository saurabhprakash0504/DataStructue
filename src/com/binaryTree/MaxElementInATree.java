package com.binaryTree;

public class MaxElementInATree {
	Node root;
	static int max=Integer.MIN_VALUE;
	public static void main(String[] args) {
		MaxElementInATree tree=new MaxElementInATree();
		   tree.root= new Node(1);
	       tree.root.left= new Node(2);
	       tree.root.right= new Node(3);
	       tree.root.left.left= new Node(4);
	       tree.root.left.right= new Node(5);
	       tree.root.right.left= new Node(62);
	       tree.root.right.right= new Node(7);
	      
	       System.out.println("Level order traversal of binary tree is "+ MaxElementInATree.maximumElement(tree.root));
	}
	
	private static int maximumElement(Node root2) {
		
		if(root2==null)
			return 0;
		else {
			int nodeVal=root2.data;
		int leftMax=maximumElement(root2.left);
		int rightMax=maximumElement(root2.right);
		if(leftMax>nodeVal)
			nodeVal=leftMax;
		if(rightMax>nodeVal)
			nodeVal=rightMax;
		
		return nodeVal;
		
	}
	}
}
