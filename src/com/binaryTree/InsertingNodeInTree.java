package com.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class InsertingNodeInTree {

	Node root;
	public static void main(String[] args) {
		InsertingNodeInTree tree=new InsertingNodeInTree();
		tree.root = new Node(2);
		tree.root.left = new Node(7);
		tree.root.right = new Node(5);
		tree.root.left.right = new Node(6);
		tree.root.left.right.left = new Node(1);
		tree.root.left.right.right = new Node(12);
		tree.root.right.right = new Node(91);
		tree.root.right.right.left = new Node(4);
		InsertingNodeInTree.insert(tree.root, 30);
		//printing(tree.root);
	}

	private static void printing(Node root2) {
		if (root2==null)
			return;
		printing(root2.left);
		System.out.print(" values >> " +root2.data);
		printing(root2.right);
	}

	static void insert(Node root,int data) {
		if (root==null) {
			Node newNode=new Node(data);
			root=newNode;
		}
		else {
			Queue<Node> queue=new LinkedList<>();
			queue.offer(root);
			
			while(!queue.isEmpty()) {
				Node tmp=queue.poll();
				if(tmp.left!=null) {
					queue.offer(tmp.left);
				}
				else {
					tmp.left=new Node(data);
					break;
				}if(tmp.right!=null) {
					queue.offer(tmp.right);
				}
				else {
					tmp.right=new Node(data);
					break;
				}
			}
		}
		printing(root);
	}
}
