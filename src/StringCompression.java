package com.trees.practice;

public class StringCompression {
	
	String compression(String str) {
		
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++) {
			if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i));
				sb.append(count);
				count = 1;
			}
			else count++;
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		
		String s = "aabcccccaabxxvv";
		StringCompression obj = new StringCompression();
		String ans = obj.compression(s);
		System.out.println(ans);
		
		
	}

}
