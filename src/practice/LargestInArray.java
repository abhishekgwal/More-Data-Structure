package practice;

import java.util.Arrays;

public class LargestInArray {

	int largestElement(int arr[]) {

		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		return max;
		
	}

	public static void main(String[] args) {

		LargestInArray obj = new LargestInArray();
		int array[] = { 1, 3, 5, 2, 4 };
		System.out.println(obj.largestElement(array));

	}

}
