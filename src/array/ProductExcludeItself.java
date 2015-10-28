package array;

import java.util.ArrayList;
import java.util.Iterator;

public class ProductExcludeItself {
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		productExcludeItself(A);
	}

	/**
	 * @param A:
	 *            Given an integers array A
	 * @return: A Long array B and B[i]= A[0] * ... * A[i-1] * A[i+1] * ... *
	 *          A[n-1]
	 */
	public static ArrayList<Long> productExcludeItself(ArrayList<Integer> A) {
		ArrayList<Long> B = new ArrayList<Long>();
		for (int i = 0; i < A.size(); i++) {
			A.remove(i);
			B.add(e)
		}
		return null;
	}
}
