package com.trees.practice;

import java.util.Stack;

//https://leetcode.com/problems/valid-parentheses/

public class ValidParenthesis {
	
	public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        // Iterate through string until empty
        for(int i = 0; i<s.length(); i++) {
            // Push any open parentheses onto stack
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                stack.push(s.charAt(i));
            // Check stack for corresponding closing parentheses, false if not valid
            else if (stack.empty())
            	return false;
            else if(s.charAt(i) == ')' && stack.peek() == '(')
                stack.pop();
            else if(s.charAt(i) == ']' && stack.peek() == '[')
                stack.pop();
            else if(s.charAt(i) == '}' && stack.peek() == '{')
                stack.pop();
            else
                return false;
        }
        // return true if no open parentheses left in stack
        return stack.isEmpty();
	}

	public static void main(String[] args) {

		String str = "()[]";
		ValidParenthesis obj = new ValidParenthesis();
		boolean result = obj.isValid(str);
		System.out.println(result);
	}
}
