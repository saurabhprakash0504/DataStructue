package com.binaryTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class BinaryTreeLevel
{
    // Root of the Binary Tree
    Node root;
    HashMap<Integer,List<Integer>> h=new HashMap();
    public BinaryTreeLevel()
    {
        root = null;
    }
 
    /* function to print level order traversal of tree*/
    HashMap printLevelOrder()
    {
        int h = height(root);
        int i;
        HashMap j =new HashMap<>();
        for (i=1; i<=h; i++) {
        	List<Integer> l=new ArrayList<Integer>();
             j =printGivenLevel(root, i,i,l);
    }
        return j;
     
    }
    /* Compute the "height" of a tree -- the number of
    nodes along the longest path from the root node
    down to the farthest leaf node.*/
    int height(Node root)
    {
        if (root == null)
           return 0;
        else
        {
            /* compute  height of each subtree */
            int lheight = height(root.left);
            int rheight = height(root.right);
             
            /* use the larger one */
            if (lheight > rheight)
                return(lheight+1);
            else return(rheight+1); 
        }
    }
    
    /* Print nodes at the given level */
    HashMap printGivenLevel (Node root ,int level, int finalLevel, List<Integer> l)
    {
        if (root == null)
            return null;
        if (level == 1) {
        	l.add(root.data);
        	h.put(finalLevel, l);
        	//System.out.print(root.data + " ");
        }else if (level > 1)
        {
            printGivenLevel(root.left, level-1,finalLevel,l);
            printGivenLevel(root.right, level-1,finalLevel,l);
        }
        return h;
    }
     
    /* Driver program to test above functions */
    public static void main(String args[])
    {
       BinaryTreeLevel tree = new BinaryTreeLevel();
       tree.root= new Node(1);
       tree.root.left= new Node(2);
       tree.root.right= new Node(3);
       tree.root.left.left= new Node(4);
       tree.root.left.right= new Node(5);
       tree.root.right.left= new Node(6);
       tree.root.right.right= new Node(7);
       System.out.println("Level order traversal of binary tree is ");
       HashMap j =tree.printLevelOrder();
       
       for (int k=j.size();k>=1;k--) {
       	System.out.print(j.get(k));
       }
    }
}
