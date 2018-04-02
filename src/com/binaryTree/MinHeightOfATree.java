package com.binaryTree;

public class MinHeightOfATree {

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
		System.out.println(MinHeightOfATree.height(tree.root));
		// printing(tree.root);
	}

	private static int height(Node root2) {
		if (root2 == null)
			return 0;
		int left = height(root2.left);
		int right = height(root2.right);
		return (left > right) ? left + 1 : right + 1;
	}
}
