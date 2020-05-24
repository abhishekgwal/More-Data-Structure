package com.trees.practice;

class BTree {

	BTree left;
	BTree right;
	int data;

	BTree(int data) {
		this.data = data;
	}
}

public class MaxElementInBST {

	BTree insert(int data, BTree root) {
		if (root == null) {
			root = new BTree(data);
		} else if (data < root.data) {
			root.left = insert(data, root.left);
		} else
			root.right = insert(data, root.right);

		return root;
	}

	int maxElement(BTree root) {

		if (root == null) {
			return -1;
		}
		
		if (root.right == null)
			return root.data;
		
		else return maxElement(root.right);
		
	}

	public static void main(String[] args) {

		BTree root = null;
		MaxElementInBST obj = new MaxElementInBST();
		root = obj.insert(8, root);
		root = obj.insert(3, root);
		root = obj.insert(1, root);
		root = obj.insert(10, root);
		root = obj.insert(6, root);
		root = obj.insert(14, root);
		root = obj.insert(4, root);
		root = obj.insert(7, root);
		root = obj.insert(13, root);

		int max = obj.maxElement(root);
		System.out.println(max);

	}

}
