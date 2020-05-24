package com.trees.practice;

public class UrlifyAnotherSolution {
	
	String urlify(String str, int length) {
		
		str = str.trim();
		int index = 0, spaceCount = 0, finalStringLength = 0;
		for (int i = 0; i < length; i++) {
			char ch = str.charAt(i);
			if (ch == ' ')
				spaceCount++;
		}
		
		char[] strArray = str.toCharArray();
		finalStringLength = spaceCount * 2 + length;
		char[] chArray = new char[finalStringLength];
		for (char c : strArray) {
			if (c == ' ') {
				chArray[index++] = '%';
				chArray[index++] = '2';
				chArray[index++] = '0';
			}
			else
			chArray[index++] = c;
		}
		return new String(chArray);
	}

	public static void main(String[] args) {

		UrlifyAnotherSolution obj = new UrlifyAnotherSolution();
		String s =  "Mr John Smith         ";
		String result = obj.urlify(s, 13);
		System.out.println(result);
	}
}
