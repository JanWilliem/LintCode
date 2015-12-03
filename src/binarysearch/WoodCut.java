package binarysearch;

public class WoodCut {
	public static void main(String[] args) {
		int[] L = { 232, 124, 456 };
		int k = 7;
		int k1 = woodCut(L, k);
		System.err.println(k1);
	}

	private static int woodCut(int[] L, int k) {
		int max = 0;
		for (int i = 0; i < L.length; i++) {
			max = Math.max(max, L[i]);
		}

		// find the largest length that can cut more than k pieces of wood.
		int start = 1, end = max;
		while (start + 1 < end) {
			int mid = start + (end - start) / 2;
			if (count(L, mid) >= k) {
				start = mid;
			} else {
				end = mid;
			}
		}

		if (count(L, end) >= k) {
			return end;
		}
		if (count(L, start) >= k) {
			return start;
		}
		return 0;
	}

	private static int count(int[] L, int length) {
		int sum = 0;
		for (int i = 0; i < L.length; i++) {
			sum += L[i] / length;
		}
		return sum;
	}
}
