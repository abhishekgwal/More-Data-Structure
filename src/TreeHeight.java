package com.trees.practice;

/**
 * Program to count height of a Tree. You can also count height of a 
 * given node. For example: if we pass root.right then it means you 
 * want to get the height of node 15. In the below code you will get
 * height = 2 for Node 15.
 * @author Abhishek
 *
 */

public class TreeHeight {
	
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

	int height(Tree node) {
		
		if (node == null)
			return -1;
			
			int lst = height(node.left);
			int rst = height(node.right);
			
			return Math.max(lst, rst) + 1;
		
	}
	
	
	public static void main(String[] args) {
		
		Tree root = null;
		TreeHeight obj = new TreeHeight();
		root = obj.insert(root, 9);
		root = obj.insert(root, 5);
		root = obj.insert(root, 15);
		root = obj.insert(root, 10);
		root = obj.insert(root, 16);
		root = obj.insert(root, 2);
		root = obj.insert(root, 18);
		int height = obj.height(root);
		System.out.println(height);
		
	}

}
