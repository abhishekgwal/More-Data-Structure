package practice;

//Note : This program is NOT CORRECT. Only check this program to understand the logic of how the characters will split into a hash map. 
// Other than that, this program does not gives correct output. For example: aaabccdaaa should give a3b1c2d1a3 but it is giving a6b1c2d1

import java.util.LinkedHashMap;

public class StringCompression {

	LinkedHashMap<Character, Integer> concatString(String str) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		Character c;
		for (int i = 0; i<str.length(); i++) {
			c = str.charAt(i);
			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else 
				hm.put(c, 1);
		}
		return hm;
	}
	
	public static void main(String[] args) {
		
		StringCompression obj = new StringCompression();
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		hm = obj.concatString("aabcccccaaa");		
		
		for(Object obj1:hm.keySet()) {
			System.out.print(obj1);   
			System.out.print(hm.get(obj1));
			   
	}
		
	}

}
