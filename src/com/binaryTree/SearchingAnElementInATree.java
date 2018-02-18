package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SearchingAnElementInATree {
	Node root;
	boolean flag = false;
	public static void main(String args[]) {
		SearchingAnElementInATree tree = new SearchingAnElementInATree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);
		tree.root.right.right.left = new Node(4);

		int data = 44;

		boolean flag = tree.search(tree.root, data);
		if (flag == true)
			System.out.println("found");
		else
			System.out.println("Not found");
	}

/*	boolean search(Node root, int data) {
		
		if (null != root) {
			if (root.data == data) {
				flag = true;
			}
				search(root.left, data);
				search(root.right, data);
		}
		return flag;
	}*/
	
	
	boolean search(Node root, int data) {
		Queue<Node> queue = new LinkedList<>();
		if (root != null) {
			queue.offer(root);
		}
		while (!queue.isEmpty()) {
			Node tmp = queue.poll();
			if (tmp != null) {
				if (tmp.data == data) {
					flag = true;
				}
			}
			if (tmp.left != null) {
				queue.offer(tmp.left);
			}
			if (tmp.right != null) {
				queue.offer(tmp.right);
			}
		}
		return flag;
	}
}