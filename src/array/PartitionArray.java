package array;

import java.util.Arrays;

/** 
 *@param nums: The integer array you should partition
 *@param k: As description
 *return: The index after partition
 */
public class PartitionArray {
	public static void main(String[] args) {
		int[] nums = {3,1,0,6,7,9,8,7,9,6,8,6,8,9,8,7,8,6,7,6,6,8,6,6};
		int k = 5;
		int j = partitionArray(nums,k);
		System.err.println(j);
	}

	private static int partitionArray(int[] nums, int k) {
		 int i = 0, j = nums.length - 1;
	        while (i <= j) {
	            while (i <= j && nums[i] < k) i++;
	            while (i <= j && nums[j] >= k) j--;
	            if (i <= j) {
	                int temp = nums[i];
	                nums[i] = nums[j];
	                nums[j] = temp;
	                i++;
	                j--;
	            }
	        }
	        return i;

	}
}
