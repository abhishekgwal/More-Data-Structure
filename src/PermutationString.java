package com.trees.practice;

//Question# 2, chapter 1 - CTCI to check if two string are permutation to each other

import java.util.Arrays;

public class PermutationString {
	
	boolean isPermutation(String s1, String s2) {
		
		if(s1.length() != s2.length())
			return false;
		
		char[] ch1 = s1.toCharArray(); 
		char[] ch2 = s2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if (Arrays.equals(ch1, ch2))
			return true;
		
		return false;
	}

	public static void main(String[] args) {

		String s1 = "god", s2 = "doggie";
		PermutationString obj = new PermutationString();
		boolean res = obj.isPermutation(s1, s2);
		System.out.println(res);
		
	}

}
