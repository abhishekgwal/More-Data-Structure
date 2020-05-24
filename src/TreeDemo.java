package com.trees.practice;

/**
 * A demo program to create a simple BST. inOrder traversal has been done.
 * insert() method is used to insert nodes in the tree.
 * @author Abhishek
 *
 */

class Tree {
	
	int data;
	Tree left;
	Tree right;
	
	Tree(int data) {
		this.data = data;
	}
}

public class TreeDemo {
	
	void inOrder(Tree root) {
		if (root == null)
			return;
		inOrder(root.left);
		System.out.println(root.data);
		inOrder(root.right);
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
		TreeDemo obj = new TreeDemo();
		
		root = obj.insert(root, 9);
		root = obj.insert(root, 5);
		root = obj.insert(root, 15);
		root = obj.insert(root, 10);
		root = obj.insert(root, 16);
		root = obj.insert(root, 2);
		root = obj.insert(root, 18);
		obj.inOrder(root);
		
	}
}
