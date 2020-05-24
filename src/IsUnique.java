package com.trees.practice;

//Chapter Q-1 CTCI

public class IsUnique {

	public boolean isUnique(String str) {
		boolean ch[] = new boolean[128];
		int val = 0;
		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i);
			if (ch[val] == false)
				ch[val] = true;
			else return false;
		}
			return true;
	}
	
	public static void main(String[] args) {

		String s = "computer";
		IsUnique obj = new IsUnique();
		boolean boo = obj.isUnique(s);
		System.out.println(boo);
	}
}
