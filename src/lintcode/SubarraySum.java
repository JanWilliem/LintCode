package lintcode;

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
 * Note There is at least one subarray that it's sum equals to zero.
 * 
 * @author Administrator
 *
 */
public class SubarraySum {
	public static void main(String[] args) {
		int[] sums = { 4, 10, 13, 4, -1, 0, 3, 3, 5 };
		subarraySum(sums);
	}

	/**
	 * @param nums:
	 *            A list of integers
	 * @return: A list of integers includes the index of the first number and
	 *          the index of the last number
	 */
	public static ArrayList<Integer> subarraySum(int[] nums) {

		ArrayList<Integer> integerList = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int sum = 0;
			if (nums[i] == 0) {
				integerList.add(i);
				integerList.add(i);
				return integerList;
			}

			for (int j = i + 1; j < nums.length; j++) {
				sum += nums[j];
				if ((nums[i] + sum) == 0) {
					integerList.add(i);
					integerList.add(j);
					System.err.println(integerList);
					return integerList;
				} else {
					continue;
				}
			}
		}
		return integerList;
	}
}
