package com.trees.practice;

public class OneAway {
	
	public boolean oneAway(String s1, String s2) {
		
		int s1_len = s1.length(), s2_len = s2.length();
		int i = 0, j = 0, count = 0;
		if (Math.abs(s1.length() - s2.length()) > 1)
			return false;
		
		else if (s1_len > s2_len) {
			while(i < s1_len && j < s2_len) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				}
				else {
					i++;
					count++;
				}
			}
		}
		
		else if (s1_len < s2_len) {
			while(i < s1_len && j < s2_len) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				}
				else {
					j++;
					count++;
				}
			}
		}

		else if (s1_len == s2_len) {
			while(i < s1_len && j < s2_len) {
				if (s1.charAt(i) == s2.charAt(j)) {
					i++;
					j++;
				}
				else {
					i++;
					j++;
					count++;
				}
			}
		}
		if (count > 1)
			return false;
		else return true;
	}

	public static void main(String[] args) {

		String s1 = "pales", s2 = "pale";
		OneAway obj = new OneAway();
		boolean ans = obj.oneAway(s1, s2);
		System.out.println(ans);
		
	}
}
