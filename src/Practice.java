package com.trees.practice;

import java.util.HashMap;
import java.util.Map;

public class Practice {

	public static void main(String[] args) {

		String s = "My name is Abhishek";
		char ch[] = s.toCharArray();
		System.out.println(ch);
//============================================================		
		//char array to String 
		String s1 = String.valueOf(ch);
		System.out.println(s1);
//============================================================
		
		HashMap<Character, Integer> hm = new HashMap<>();
		hm.put('t', 1);
		hm.put('g', 9);
		hm.put('h', 6);
		
		//Iterate over a hash map
		for (Map.Entry<Character, Integer> entry: hm.entrySet()) {
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
			
		}

//============================================================		
	//lexicographically comparison in compareTo method
		
		String str1 = "pale", str2 = "ple";
		System.out.println(str1.compareTo(str2));
		System.out.println("computer".compareTo ("comparison"));

//============================================================		
	
		//Adding string with an integer
		int i = 2;
		String str3 = "Abhishek" + 9 + i;
		System.out.println(str3);
	
//============================================================
		
		String str4 = "test";
		str4 = str4 + str4;
		System.out.println(str4);
		
	}

}
