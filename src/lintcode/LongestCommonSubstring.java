package lintcode;

public class LongestCommonSubstring {
	public static void main(String[] args) {
		String A = "ABCD";
		String B = "CBCD";
		longestCommonSubstring(A, B);
	}

	/**
	 * @param A
	 *            , B: Two string.
	 * @return: the length of the longest common substring.
	 */
	public static int longestCommonSubstring(String A, String B) {
		if (A.equals(null) || B.equals(null)) {
			return 0;
		}
		char[] a = A.toCharArray();
		char[] b = B.toCharArray();
		int lcs = 0, lcs_temp = 0;
		for (int i = 0; i < A.length(); ++i) {
			for (int j = 0; j < B.length(); ++j) {
				lcs_temp = 0;
				while ((i + lcs_temp < A.length())
						&& (j + lcs_temp < B.length())
						&& (a[i + lcs_temp] == b[j + lcs_temp])) {
					++lcs_temp;
				}
				if (lcs_temp > lcs) {
					lcs = lcs_temp;
				}
			}
		}
		System.err.println(lcs);
		return lcs;
	}
}
