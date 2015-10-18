package lintcode;

import java.util.HashMap;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		String A = "ABCD";
		String B = "ABEF";
		String C = "ACEF";
		longestCommonPrefixSt(A, B, C);
	}

	private static String longestCommonPrefixSt(String... strs) {
		if (strs.length == 0)
			return "";
		String minStr = strs[0];

		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minStr.length())
				minStr = strs[i];
		}
		int end = minStr.length();
		for (int i = 0; i < strs.length; i++) {
			int j;
			for (j = 0; j < end; j++) {
				if (minStr.charAt(j) != strs[i].charAt(j))
					break;
			}
			if (j < end)
				end = j;
		}
		
		return minStr.substring(0, end);
	}

}
