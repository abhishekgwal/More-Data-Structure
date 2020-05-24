package com.trees.practice;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversalUsingList {

	List<Integer> list = new ArrayList<>();

	public List<Integer> inOrderTraversal (Tree root) {
		return inOrder(root, new ArrayList<Integer>());
	}
	
	List<Integer> inOrder(Tree node, ArrayList<Integer> list) {
		   
	if (node == null)
	    return list;
			    
	  inOrder(node.left, list);
	  list.add(node.data);
	  inOrder(node.right, list);
			    
	  return list;
  }

	public static void main(String[] args) {

		InorderTraversalUsingList obj = new InorderTraversalUsingList();

		Tree root = null;

		root = new Tree(7);
		root.left = new Tree(4);
		root.right = new Tree(3);
		root.left.left = new Tree(1);
		root.left.right = new Tree(6);

		List<Integer> list = obj.inOrderTraversal(root);

		for (Integer i : list)
			System.out.print(i + " ");
	}
}
