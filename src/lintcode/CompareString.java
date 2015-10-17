package lintcode;

import java.util.HashMap;
import java.util.Map;

/**
 * �Ƚ������ַ���A��B��ȷ��A���Ƿ����B�����е��ַ����ַ���A��B�е��ַ����� ��д��ĸ
 * 
 * ������ʵ���������Ƿ�����������⣿ Yes ���� ���� A = "ABCD" B = "ACD"������ true
 * 
 * ���� A = "ABCD" B = "AABC"�� ���� false
 * 
 * ע�� �� A �г��ֵ� B �ַ�������ַ�����Ҫ������������
 * 
 * @author Administrator
 *
 */
public class CompareString {
	public static void main(String[] args) {
		String A = "ABCD";
		String B = "CDA";
		// ifContains(A, B);
		// compareString1(A, B);
		compareString2(A, B);
	}

	private static void compareString2(String a, String b) {
		for (int i = 0; i < b.length(); i++) {
			for (int j = 0; j < a.length(); j++) {
				char cb = b.charAt(i);
				char ca = a.charAt(j);

			}
		}

	}

	private static void ifContains(String a, String b) {
		if (a.contains(b)) {
			System.err.println(11111);
		} else {
			System.err.println(22222);
		}

	}

	private static boolean compareString1(String a, String b) {
		if (a == null || b == null || b.length() > a.length()) {
			return false;
		}
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < a.length(); i++) {
			char c = a.charAt(i);
			if (map.containsKey(c)) {
				int value = map.get(c);
				map.put(c, ++value);

			} else {
				map.put(c, 1);
			}
		}
		for (int i = 0; i < b.length(); i++) {
			char c = b.charAt(i);
			if (map.containsKey(c)) {
				int value = map.get(c);
				if (--value < 0)
					return false;
				map.put(c, value);
			} else {
				return false;
			}
		}
		return true;

	}

}
