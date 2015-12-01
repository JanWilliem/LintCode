package binarysearch;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 3, 4, 5, 10};
		int target = 3;
		int k = binarySearch(nums,target);
		System.err.println(k);
	}

	private static int binarySearch(int[] nums, int target) {
		if (nums.equals(null) || nums.length==0) {
			return -1;
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == target) {
				return i;
			}
		}
		return -1;
		
		// TODO Auto-generated method stub
		
	}
}
