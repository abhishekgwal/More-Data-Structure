package com.trees.practice;

/**
 * https://leetcode.com/problems/string-compression/
 * @author Abhishek
 *
 */
public class StringCompression2 {
	
	public int compress(char[] chars) {
        int indexAns = 0, index = 0;
        while(index < chars.length){
            char currentChar = chars[index];
            int count = 0;
            while(index < chars.length && chars[index] == currentChar){
                index++;
                count++;
            }
            chars[indexAns++] = currentChar;
            if(count != 1)
                for(char c : Integer.toString(count).toCharArray()) 
                    chars[indexAns++] = c;
        }
        return indexAns;
    }

	public static void main(String[] args) {

		StringCompression2 obj = new StringCompression2();
		char ch[] = {'a','b','b','b','c'};
		System.out.println(obj.compress(ch));
		
	}
}
