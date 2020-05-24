package com.trees.practice;

/**
 * This program is find the count of no. of nodes in the LST and RST for a given tree.
 * 
 * @author Abhishek
 *
 */

public class CountLstRstNodes {
	
	static int count = 0;
	
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
	
	int countLstRst(Tree node) {
		if(node == null) 
			return 0;
		countLstRst(node.left);
		count += 1;
		countLstRst(node.right);
		return count;
	}
	
	public static void main(String[] args) {
		
		Tree root = null;
		CountLstRstNodes obj  = new CountLstRstNodes();
		root = obj.insert(root, 9);
		root = obj.insert(root, 15);
		root = obj.insert(root, 18);
		root = obj.insert(root, 20);
		root = obj.insert(root, 6);
		root = obj.insert(root, 7);
		root = obj.insert(root, 3);
		root = obj.insert(root, 1);
		root = obj.insert(root, 2);
		int lstCount = obj.countLstRst(root.left);
		count = 0;
		int rstCount = obj.countLstRst(root.right);
		System.out.println("LST Node Count "+lstCount);
		System.out.println("RST Node Count "+rstCount);
	}

}
