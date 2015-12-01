package binarysearch;

public class SearchMatrix {
	public static void main(String[] args) {

		int[][] matrix = { { 1, 3, 5, 7 }, { 10, 11, 16, 20 },
				{ 23, 30, 34, 50 } };
		int target = 3;
		searchMatrix(matrix, target);
	}

	private static boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length == 0 || matrix.equals(null)) {
			return false;
		}
		for (int j = 0; j < matrix.length; j++) {
			for (int j2 = 0; j2 < matrix[j].length; j2++) {
				if (matrix[j][j2] == target) {
					return true;
				}
			}
		}

		return false;

	}

}
