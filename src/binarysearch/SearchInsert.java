package binarysearch;

public class SearchInsert {
	public static void main(String[] args) {
		int[] A = {1,3,5,6};
		int target = 7;
		int k = searchInsert(A,target);
		System.err.println(k);
	}

	private static int searchInsert(int[] A, int target) {
		if (A.length == 0 || A.equals(null)) {
			return 0;
		}
		for(int i = 0; i < A.length; i++)
		{
			if (A[i] >= target) {
				return i;
			}
		}
		return A.length;
		
	}
}
