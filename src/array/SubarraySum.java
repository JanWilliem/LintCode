package array;

import java.util.ArrayList;

/**
 * Subarray Sum
 * 
 * 25% Accepted Given an integer array, find a subarray where the sum of numbers
 * is zero. Your code should return the index of the first number and the index
 * of the last number.
 * 
 * Have you met this question in a real interview? Yes Example Given [-3, 1, 2,
 * -3, 4], return [0, 2] or [1, 3].
 * 
 * @author smith
 *
 */
public class SubarraySum {
	public static void main(String[] args) {
		int[] nums = { -3, 1, 2, -3, 4 };
		subarraySum(nums);
	}

	public static ArrayList<Integer> subarraySum(int[] nums) {
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		int start = 0;
		int last = 0;
		while (start < nums.length) {
			if ((nums[start] + nums[last]) == 0) {

			}
		}
		return null;

	}

}
