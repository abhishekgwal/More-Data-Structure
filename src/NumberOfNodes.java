package com.trees.practice;

/**
 * Program to count no. of nodes in a Tree
 * @author Abhishek
 *
 */

public class NumberOfNodes {

	int c = 0;
	int noOfNodes(Tree root) {
		if (root == null)
			return 0;
		noOfNodes(root.left);
		c = c + 1;
		noOfNodes(root.right);
		return c;
	}

	Tree insert(Tree root, int data) {
		if(root == null) {
			root = new Tree(data);
		} else if (data <= root.data) {
			root.left = insert(root.left, data);
		} else {
			root.right = insert(root.right, data);
		}
		return root;
	}
	
	public static void main(String[] args) {
		
		Tree root = null;
		NumberOfNodes obj = new NumberOfNodes();
		
		root = obj.insert(root, 9);
		root = obj.insert(root, 5);
		root = obj.insert(root, 15);
		root = obj.insert(root, 10);
		root = obj.insert(root, 16);
		root = obj.insert(root, 2);
		root = obj.insert(root, 18);
		root = obj.insert(root, 20);
		int nodes = obj.noOfNodes(root);
		System.out.println(nodes); 
	}
}
