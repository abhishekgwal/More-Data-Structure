package com.trees.practice;

public class UrlifyBruteForce {
	
	String urlify(String str) {
		int charVal = 0;
		String s = str.trim(), finalStr = "";
		
		for (int i = 0; i < s.length(); i++) {
			charVal = s.charAt(i);
			if (charVal == 32)
				finalStr = finalStr + "%20";
			else
				finalStr = finalStr + s.charAt(i);
		}
		return finalStr;
	}

	public static void main(String[] args) {

		UrlifyBruteForce obj = new UrlifyBruteForce();
		String s = "Mr John Smith     ";
		String ans = obj.urlify(s);
		System.out.println(ans);
	}

}
