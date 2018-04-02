package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PrintingTreeInReverseOrder {
	Node root;
	public static void main(String[] args) {
		PrintingTreeInReverseOrder tree=new PrintingTreeInReverseOrder();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.right = new Node(5);
		tree.root.left.left = new Node(4);
		tree.root.right.left = new Node(6);
		tree.root.right.right= new Node(7);
		PrintingTreeInReverseOrder.printingRev(tree.root);
	}

	/*static void printingRev(Node root) {
		if(root != null) {
			
			printingRev(root.left);
			printingRev(root.right);
		}
		if(root!=null)
		System.out.println(root.data);
	}*/
	
	static void printingRev(Node root) {
	if (root==null) {
		return ;
	}
	else {
		Queue<Node> queue=new LinkedList<>();
		Stack<Node> s=new Stack<Node>();
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			Node tmp=queue.poll();
			if(tmp.left!=null) {
				queue.offer(tmp.left);
			}
			if(tmp.right!=null) {
				queue.offer(tmp.right);
			}
			s.push(tmp);
		}
		while(!s.isEmpty()) {
			System.out.println("value >> "+s.pop().data);
		}
	}
	
}

}
