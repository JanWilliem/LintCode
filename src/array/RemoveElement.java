package array;

import java.util.ArrayList;

/**
 * Given an array and a value, remove all occurrences of that value in place and
 * return the new length.
 * 
 * The order of elements can be changed, and the elements after the new length
 * don't matter.
 * 
 * Yes Example Given an array [0,4,4,0,0,2,4,4], value=4
 * 
 * return 4 and front four elements of the array is [0,0,0,2]
 * 
 * @author smith
 *
 */
public class RemoveElement {
	public static void main(String[] args) {
		int[] A = { 0, 4, 4, 0, 0, 2, 4, 4 };
		int elem = 4;
		removeElement(A, elem);
	}

	private static int removeElement(int[] A, int elem) {
		/*int k = A.length;
		int j = 0;
		int x = 0;
		ArrayList<Integer> array = new ArrayList<Integer>();
		ArrayList<Integer> arrayToRemove = new ArrayList<Integer>();
		for (int i = 0; i < A.length; i++) {
			array.add(A[i]);
			if (A[i] == elem) {
				arrayToRemove.add(i);
				j++;
			}
		}
		for (Integer integer : arrayToRemove) {
			array.remove(integer - x);
			x++;
		}
		Integer[] array1 = array.toArray(new Integer[array.size()]);
		return k - j;*/
		int number = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] != elem) {
				A[number++] = A[i];
			}

		}
		return number;

	}
}
