package com.trees.practice;

public class IsBalancedBinaryTree {

boolean isTreeBalanced (Tree root) {
		
		if (root == null)
			return true;
		
		int leftHt = height(root.left);
		int rightHt = height(root.right);
		
		if (Math.abs(leftHt - rightHt) > 1)
			return false;
		
		else return isTreeBalanced(root.left)&& isTreeBalanced(root.right);
	}

	private int height(Tree root) {

		if (root == null)
			return -1;
		
		int lst = height (root.left);
		int rst = height (root.right);
		
		return Math.max(lst, rst) + 1;
	}

	public static void main(String[] args) {

		IsBalancedBinaryTree obj = new IsBalancedBinaryTree();
		Tree root = null;
		root = new Tree(1);
		
		root.left = new Tree(2);
		root.left.left = new Tree(3);
		root.left.left.left = new Tree(4);
		
		root.right = new Tree(2);
		root.right.right = new Tree(3);
		root.right.right.right = new Tree(4);
		
		System.out.println(obj.isTreeBalanced(root));
		
	}

}
