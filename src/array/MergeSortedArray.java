package array;

import java.util.ArrayList;

/**
 * Given two sorted integer arrays A and B, merge B into A as one sorted array.
 * 
 * Have you met this question in a real interview? Yes Example A = [1, 2, 3,
 * empty, empty], B = [4, 5]
 * 
 * After merge, A will be filled as [1, 2, 3, 4, 5]
 * 
 * Note You may assume that A has enough space (size that is greater or equal to
 * m + n) to hold additional elements from B. The number of elements initialized
 * in A and B are m and n respectively.
 * 
 * @author smith
 *
 */
public class MergeSortedArray {
	public static void main(String[] args) {

		int[] A = { 1, 2, 3 };
		int m = A.length;
		int[] B = { 4, 5 };
		int n = B.length;

		mergeSortedArray(A, m, B, n);
	}

	/**
	 * @param A
	 *            : sorted integer array A which has m elements, but size of A
	 *            is m+n
	 * @param B
	 *            : sorted integer array B which has n elements
	 * @return: void
	 */
	public static void mergeSortedArray(int[] A, int m, int[] B, int n) {
		int i = m - 1, j = n - 1, index = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (A[i] > B[j]) {
				A[index--] = A[i--];
			} else {
				A[index--] = B[j--];
			}
		}
		while (i >= 0) {
			A[index--] = A[i--];
		}
		while (j >= 0) {
			A[index--] = B[j--];
		}
	}
}
