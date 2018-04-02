package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class HeightOfATreeUsingQueue {
	
	Node root;

	public static void main(String[] args) {
		InsertingNodeInTree tree = new InsertingNodeInTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		//tree.root.left.right.left.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);
		tree.root.right.right.left = new Node(4);
	//	tree.root.right.right.left.left = new Node(14);
		HeightOfATreeUsingQueue HeightOfATreeUsingQueue=new HeightOfATreeUsingQueue();
		
		System.out.println(HeightOfATreeUsingQueue.heightTree(tree.root));
		// printing(tree.root);
	}

	public int heightTree(Node root) {
		if (root == null)
			return 0;
		Queue<Node> q = new LinkedList<>();
		System.out.println("qq "+q);
		q.offer(root);
		q.offer(null);
		int count = 1;
		while (!q.isEmpty()) {
			Node currentNode = q.poll();
			if (currentNode != null) {
				if (currentNode.left == null && currentNode.right == null) {
					continue;
				}
				if (currentNode.left != null) {
					q.offer(currentNode.left);
				}
				if (currentNode.right != null) {
					q.offer(currentNode.right);
				}
			} else {
				if (!q.isEmpty()) {
					count++;
					q.offer(null);
				}
			}
			System.out.println("qqq "+q);
		}
		System.out.println("q"+q);
		return count;
	}

}
