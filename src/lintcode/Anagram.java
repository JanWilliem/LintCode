package lintcode;

public class Anagram {

	public static void main(String[] args) {

		String s = "abcd";
		String t = "aabd";
		anagram(s, t);

	}

	public static boolean anagram(String s, String t) {

		int i = 0;
		for (int j = t.length() - 1; j > 0; j--) {

			if (s.charAt(i) == t.charAt(j)) {
				i++;
				continue;

			} else {
				System.err.println(2222);
				return false;
			}
		}
		if (i == s.length() - 1) {
			System.err.println(1111);
			return true;
		}

		System.err.println(3333);
		return false;

	}
}
