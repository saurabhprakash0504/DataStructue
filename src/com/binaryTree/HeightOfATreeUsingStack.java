package com.binaryTree;

import java.util.Stack;

public class HeightOfATreeUsingStack {

	public static void main(String[] args) {
		InsertingNodeInTree tree = new InsertingNodeInTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		// tree.root.left.right.left.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);
		tree.root.right.right.left = new Node(4);
		// tree.root.right.right.left.left = new Node(14);
		HeightOfATreeUsingStack HeightOfATreeUsingStack = new HeightOfATreeUsingStack();

		System.out.println(HeightOfATreeUsingStack.height(tree.root));
		// printing(tree.root);
	}

	int height(Node root) {
		if (root == null)
			return 0;
		Stack<Node> s = new Stack<>();
		s.push(root);
		int depth = 0;
		Node prev = null;
		while (!s.isEmpty()) {
			Node curr = s.peek();
			if (prev == null || prev.left == curr || prev.right == curr) {
				if (curr.left != null)
					s.push(curr.left);
				else if (curr.right != null)
					s.push(curr.right);
			} else if (curr.left == prev) {
				if (curr.right != null)
					s.push(curr.right);
			} else {
				
				s.pop();
			}
			prev = curr;
			if (s.size() > depth)
				depth = s.size();
		}
		return depth;
	}
}
