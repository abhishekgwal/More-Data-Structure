package com.trees.practice;

public class IsBalancedBinaryTreeOptimal {

boolean isTreeBalanced (Tree root) {
	return height(root) != Integer.MIN_VALUE; 
}

	private int height(Tree root) {

		if (root == null)
			return -1;
		
		int leftHt = height (root.left);
		if(leftHt == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		int rightHt = height (root.right);
		if(rightHt == Integer.MIN_VALUE) return Integer.MIN_VALUE;
		
		if(Math.abs(leftHt - rightHt) > 1)
			return Integer.MIN_VALUE;
		else
			return Math.max(leftHt, rightHt) + 1;
	}

	public static void main(String[] args) {

		IsBalancedBinaryTreeOptimal obj = new IsBalancedBinaryTreeOptimal();
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
