package practice;

import java.util.HashMap;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {

		int a[] = { 1, 1, 3, 2, 8 };
		int b[] = { 1,  3 };

		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i : a) {
			if (hm.containsKey(i))
				hm.put(i, hm.get(i) + 1);
			else
				hm.put(i, i);
		}

		for (int i : b) {
			if (hm.containsKey(i))
				System.out.println(i);
		}

	}

}
