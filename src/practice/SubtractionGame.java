package practice;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class SubtractionGame {

	public static void main(String[] args) {
		int diff = 0;
		int[] array = { 2, 7 };
		int len = array.length;

		for (int i = 0; i < len; i++) {
			for (int j = i + 1; j < len; j++) {
				diff = Math.abs(array[i] - array[j]);

			}
		}
		len = len + 1;
		//while ()
	}

}
