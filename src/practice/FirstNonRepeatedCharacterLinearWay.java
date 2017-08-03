package practice;

import java.util.HashMap;

public class FirstNonRepeatedCharacterLinearWay {

	public Character firstNonRepeated(String str) {
		Character c;
		HashMap<Character, Integer> hm = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);

			if (hm.containsKey(c))
				hm.put(c, hm.get(c) + 1);
			else
				hm.put(c, 1);
		}

		for (int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if (hm.get(c) == 1)
				return c;
		}
		return null;
	}

	public static void main(String[] args) {

		String str = "google";
		FirstNonRepeatedCharacterLinearWay obj = new FirstNonRepeatedCharacterLinearWay();
		System.out.println(obj.firstNonRepeated(str));

	}

}
