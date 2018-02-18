package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node {
	int data;
	Node left, right;

	public Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class BinaryTree {
	Node root;

	
	//OWN
	// Returns the max value in a binary tree
//	static int maxValue(Node root) {
//
//		int leftMax = Integer.MIN_VALUE;
//		int rightMax = Integer.MIN_VALUE;
//		int max = Integer.MIN_VALUE;
//		if (root != null) {
//			leftMax = maxValue(root.left);
//			rightMax = maxValue(root.right);
//
//			if (leftMax < rightMax && root.data < rightMax)
//				max = rightMax;
//			else if (rightMax < leftMax && root.data < leftMax)
//				max = leftMax;
//			else {
//				max = root.data;
//			}
//		}
//		return max;
//	}
	
	
//INTERNET	
/*static int maxValue(Node root) {
		
		int leftMax=Integer.MIN_VALUE;
		int rightMax=Integer.MIN_VALUE;
		int max=Integer.MIN_VALUE;
		if(root!=null) {
			leftMax=maxValue(root.left);
			rightMax=maxValue(root.right);
			
			if(leftMax<rightMax && root.data<rightMax)
				max=rightMax;
			else if (rightMax<leftMax && root.data<leftMax)
				max=leftMax;
			else {
				max=root.data;
			}
		}
		return max;
	}*/

//QUEUE	
	static int maxValue(Node root) {
		Queue<Node> queue = new LinkedList<>();
		int max = Integer.MIN_VALUE;
		int data = Integer.MIN_VALUE;
		if (root != null) {
			queue.offer(root);

			while (!queue.isEmpty()) {
				Node tmp = queue.poll();
				if (tmp != null)
					data = tmp.data;
				if (max < data)
					max = data;
				if (tmp != null) {
					queue.offer(tmp.left);
				}
				if (tmp != null) {
					queue.offer(tmp.right);
				}
			}
		}
		return max;
	}
	
	/* Driver program to test above functions */
	public static void main(String args[]) {
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);
		tree.root.right.right.left = new Node(4);

		System.out.println("Maximum element is " + tree.maxValue(tree.root));
	}
}
