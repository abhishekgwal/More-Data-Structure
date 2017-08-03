package practice;
// Given an array of integers, find if the array contains any duplicates. 
//Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct
//https://leetcode.com/problems/contains-duplicate/#/description
import java.util.HashSet;

public class IntegerDuplicates {

	public boolean containsDuplicate(int[] nums) {

		HashSet<Integer> hs = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			if (!hs.add(nums[i]))
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		
		int nums[] = {1, 8, 10, 1, 2, 3, 4, 5, 6};
		IntegerDuplicates obj = new IntegerDuplicates();
		boolean b= obj.containsDuplicate(nums);
		System.out.println(b);
		
	}

}
