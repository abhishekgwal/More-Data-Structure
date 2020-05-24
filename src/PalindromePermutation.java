package com.trees.practice;

//Question# 4, chapter 1 - CTCI

import java.util.HashMap;
import java.util.Map;

public class PalindromePermutation {

	boolean palindromePermutation(String str) {
		
		int temp = 0;
		char ch[] = str.toCharArray();
		Map<Character, Integer> hm = new HashMap<>();
		
		for (char c : ch) {
			if (hm.containsKey(c)) {
				hm.put(c, hm.get(c) + 1);
			}
			else hm.put(c, 1);
		}
		
		for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
			
			int mod = entry.getValue();
			if (mod % 2 != 0)
				temp++;
		}
		return (temp > 1) ? false : true;
	}
	
	public static void main(String[] args) {
		
		PalindromePermutation obj = new PalindromePermutation();
		String s = "tacocat";
		boolean ans = obj.palindromePermutation(s);
		System.out.println(ans);

	}

}
