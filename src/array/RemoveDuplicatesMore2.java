package array;

public class RemoveDuplicatesMore2 {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 2, 3, 3 };
		int size = removeDuplicates(nums);
		System.err.println(size);
	}

	private static int removeDuplicates(int[] nums) {
		if(nums == null)
            return 0;
        int cur = 0;
        int i ,j;
        for(i = 0; i < nums.length;){
            int now = nums[i];
            for( j = i; j < nums.length; j++){
                if(nums[j] != now)
                    break;
                if(j-i < 2)
                    nums[cur++] = now; 
            }
            i = j;
        }
        return cur;
	}
}
