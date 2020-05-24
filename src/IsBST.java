package com.trees.practice;

public class IsBST {
	
	boolean isBSTUtil(Tree root, int min, int max) {
		if (root == null)
			return true;
		
		if ((root.data > min && root.data < max) &&
			isBSTUtil(root.left, min, root.data)&&
			isBSTUtil(root.right, root.data, max)) 
			return true;
		else return false;
	}
	
	boolean isBST(Tree root) {
		return isBSTUtil(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static void main(String[] args) {
		
		IsBST obj = new IsBST();
		Tree root = null;

		root = new Tree(7);
		root.left = new Tree(4);
		root.right = new Tree(3);
		root.left.left = new Tree(1);
		root.left.right = new Tree(6);
		
		System.out.println(obj.isBST(root));
	}
}
