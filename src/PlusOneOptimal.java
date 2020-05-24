package com.trees.practice;

public class PlusOneOptimal {
	
	public int[] plusOne(int[] digits) {
        
	    int n = digits.length;
	    for(int i=n-1; i>=0; i--) {
	        if(digits[i] < 9) {
	            digits[i]++;
	            return digits;
	        }
	        
	        digits[i] = 0;
	    }
	    
	    int[] newNumber = new int [n+1];
	    newNumber[0] = 1;
	    
	    return newNumber;
	}

	public static void main(String[] args) {

		int array[] = {9, 9, 9};
		PlusOneOptimal obj = new PlusOneOptimal();
		int res[] = obj.plusOne(array);
		for (int plusOneValue : res) 
			System.out.println(plusOneValue);
		
	}

}
