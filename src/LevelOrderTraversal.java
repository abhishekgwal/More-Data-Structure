package com.trees.practice;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

	void levelOrderTraversal (Tree root) {
		
		System.out.print("Level Order ");
		
		Queue<Tree> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			System.out.print(queue.peek().data + " ");
			Tree temp = queue.poll();
			if(temp.left != null)
				queue.add(temp.left);
			if (temp.right != null)
				queue.add(temp.right);
		}
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
		
		LevelOrderTraversal obj1 = new LevelOrderTraversal();
		obj1.levelOrderTraversal(root);
		
	}

}
