package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class CountingTheNodes {
	Node root;
	static int counter;

	public static void main(String[] args) {
		CountingTheNodes tree = new CountingTheNodes();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);

		int i = CountingTheNodes.count(tree.root);
		System.out.println("counter >>> " + i);
	}

	/*
	 * static int count(Node root) {
	 * 
	 * if (root != null) { counter = counter + 1; int left = count(root.left);
	 * 
	 * int right = count(root.right);
	 * 
	 * } return counter; }
	 */

	static int count(Node root) {
		Queue<Node> queue = new LinkedList<Node>();
		if (root != null) {
			queue.offer(root);
		}
		while (!queue.isEmpty()) {
			Node tmp = queue.poll();
			counter = counter + 1;
			if (tmp.left != null)
				queue.offer(tmp.left);
			if (tmp.right != null)
				queue.offer(tmp.right);
		}

		return counter;
	}

}
