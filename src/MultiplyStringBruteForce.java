package com.trees.practice;

public class MultiplyStringBruteForce {
	
	/* https://leetcode.com/problems/multiply-strings/
	 *  Rules:
	 *  1. The length of both num1 and num2 is < 110.
		2. Both num1 and num2 contain only digits 0-9.
		3. Both num1 and num2 do not contain any leading zero, except the number 0 itself.
		4. You must not use any built-in BigInteger library or convert the inputs to integer directly.
	 * This program wont work for bigger numbers as int will go out of its range.
	 */
	
    public String multiply(String num1, String num2) {
     
    	Integer n1 = strToInt(num1);
    	Integer n2 = strToInt(num2);
    	Integer mul = n1 * n2;
    	
    	return mul.toString();
    }

	public Integer strToInt(String num1) {

		int intVal = 0, num1Value = 0;
		for (int i = 0; i < num1.length(); i++) {
			intVal = num1.charAt(i) - '0';
			num1Value += intVal * Math.pow(10, num1.length() - 1 - i);
		}
		return num1Value;
	}

	public static void main(String[] args) {
		
		String s1 = "150", s2 = "12";
		MultiplyStringBruteForce obj = new MultiplyStringBruteForce();
		String answer = obj.multiply(s1, s2);
		System.out.println(answer);
		
	}
}
