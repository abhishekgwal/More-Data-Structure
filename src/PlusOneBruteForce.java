package com.trees.practice;

public class PlusOneBruteForce {

	public int[] plusOne(int[] digits) {
		
		int arrToInt = 0;
		for (int i = 0; i < digits.length; i++) 
			arrToInt +=  Math.pow(10, i) * digits [digits.length - i - 1];
		arrToInt++;
		
		String strDigits = Integer.toString(arrToInt);
		int[] result = new int[strDigits.length()];
		for (int i = 0; i < strDigits.length(); i++) {
			result[i] = strDigits.charAt(i) - '0';
		}
		return result;
	}

	public static void main(String[] args) {

		int array[] = {9};
		PlusOneBruteForce obj = new PlusOneBruteForce();
		int res[] = obj.plusOne(array);
		for (int plusOneValue : res) {
			System.out.println(plusOneValue);
		}
		
	}

}
