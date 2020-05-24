package com.trees.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListOfDepths {
	
	public ArrayList<LinkedList<Tree>> listOfDepths(Tree root) {
		
		ArrayList<LinkedList<Tree>> result = new ArrayList<>();
		LinkedList<Tree> current = new LinkedList<>();
		current.add(root);
		
		while (current.size() > 0) {
			result.add(current);
			LinkedList<Tree> parents = current;
			current = new LinkedList<>();
			for (Tree parent : parents) {
			if (parent.left != null)
				current.add(parent.left);
			if(parent.right != null)
				current.add(parent.right);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		
		ListOfDepths list = new ListOfDepths();

		Tree root = null;
		TreeDemo obj = new TreeDemo();
		
		root = obj.insert(root, 9);
		root = obj.insert(root, 5);
		root = obj.insert(root, 15);
		root = obj.insert(root, 10);
		root = obj.insert(root, 16);
		root = obj.insert(root, 2);
		root = obj.insert(root, 18);
		
		ArrayList<LinkedList<Tree>> result = list.listOfDepths(root);
		
		for (LinkedList<Tree> tree : result) {
			for (Tree t : tree)
				System.out.print(t.data + " ");
			System.out.println();
		}
	}
}
