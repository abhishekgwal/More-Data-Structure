package com.trees.practice;

public class PalindromeString {
	
	boolean isPalindrome (String s1, String s2) {
		
		StringBuilder sb = new StringBuilder(s1);
		if(sb.reverse().toString().equals(s2))
			return true;
		return false;
	}

	public static void main(String[] args) {

		PalindromeString obj = new PalindromeString();
		String s1 = "CIVIwC", s2 = "CIVIC";
		boolean ans = obj.isPalindrome(s1, s2);
		System.out.println(ans);
		
	}

}
