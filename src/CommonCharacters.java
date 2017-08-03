import java.util.LinkedHashSet;


public class CommonCharacters {

	LinkedHashSet<Character> common(String s1, String s2) {
		Character c = null; 
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		LinkedHashSet<Character> res = new LinkedHashSet<Character>();
		for(int i = 0; i < s1.length(); i++) {
			hs.add(s1.charAt(i));
		}
		for(int i = 0; i < s2.length(); i ++) {
			c = s2.charAt(i);
			if(hs.contains(c))
				res.add(c);
			}
		return res;
	}
	
	public static void main(String[] args) {
		
		CommonCharacters obj = new CommonCharacters();
		System.out.println("Common Characters = "+obj.common("strongesrgt", "string"));

	}

}
