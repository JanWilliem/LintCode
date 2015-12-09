package binarysearch;

public class FindMin {
	public static void main(String[] args) {
		int[] num = { 4, 5, 6, 7, 0, 1, 2 };
		int k = findMin(num);
		System.err.println(k);
	}

	private static int findMin(int[] num) {
		if (num.equals(null) || num.length == 0) {
			return 0;
		}
		int temp = 0;
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num.length - i - 1; j++) {
				if (num[j] > num[j + 1]) {
					temp = num[j];
					num[j] = num[j + 1];
					num[j + 1] = temp;
				}

			}

		}

		return num[0];
	}
}
