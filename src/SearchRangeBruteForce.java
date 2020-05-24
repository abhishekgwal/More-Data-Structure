package com.trees.practice;

public class SearchRangeBruteForce {
	
	
		public int[] searchRange(int a[], int target) {
		
		int first = -1, last = -1;
		
		for (int i = 0; i < a.length; i++) {
			if(a[i] == target) {
				first = i;
				break;
			}
		}
		
		for (int j = a.length - 1; j >=0; j--) {
			if (a[j] == target) {
				last = j;
				break;
			}
		}
		return new int[] {first,last};
	}

	public static void main(String[] args) {
		
		int a[] = {8, 10, 10, 10, 10, 32, 36, 40};
		SearchRangeBruteForce obj = new SearchRangeBruteForce();
		
		int range[] = obj.searchRange(a, 10);
		
		for (int i : range) {
			System.out.println(i);
		}
		
	}
}
