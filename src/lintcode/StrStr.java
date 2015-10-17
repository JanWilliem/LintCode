package lintcode;

/**
 * Easy strStr

18% Accepted
strstr (a.k.a find sub string), is a useful function in string operation. Your task is to implement this function.

For a given source string and a target string, you should output the first index(from 0) of target string in source string.

If target does not exist in source, just return -1.

Have you met this question in a real interview? Yes
Example
If source = "source" and target = "target", return -1.

If source = "abcdabcdefg" and target = "bcd", return 1.

Challenge
O(n2) is acceptable. Can you implement an O(n) algorithm? (hint: KMP)

Clarification
Do I need to implement KMP Algorithm in a real interview?

Not necessary. When you meet this problem in a real interview, the interviewer may just want to test your basic implementation ability. But make sure your confirm with the interviewer first.
 */
/**
 * ���� �ַ�������
 * 
 * 18% ͨ�� �ַ������ң��ֳƲ������ַ����������ַ���������һ�������õĺ��������������ʵ�����������
 * 
 * ����һ�������� source �ַ�����һ�� target �ַ�������Ӧ���� source �ַ������ҳ� target �ַ������ֵĵ�һ��λ��(��0��ʼ)��
 * 
 * ��������ڣ��򷵻� -1��
 * 
 * ������ʵ���������Ƿ�����������⣿ Yes ���� ��� source = "source" �� target = "target"������ -1��
 * 
 * ��� source = "abcdabcdefg" �� target = "bcd"������ 1��
 * 
 * ��ս O(n2)���㷨�ǿ��Խ��ܵġ����������O(n)���㷨�������Ǹ��Ӻá�����ʾ��KMP��
 * 
 * ˵�� �����������Ƿ���Ҫʵ��KMP�㷨��
 * 
 * ����Ҫ�����������������������ʱ�����Թٺܿ���ֻ����Ҫ����һ����Ļ���Ӧ����������Ȼ����Ҫ�ȸ����Թ�ȷ�����Ҫ��ôʵ������⡣
 * 
 * @author Administrator
 *
 */
public class StrStr {

	public static void main(String[] args) {
		String source = "abcd";
		String target = "abcd";
		strStr(source, target);

	}

	/**
	 * Returns a index to the first occurrence of target in source, or -1 if
	 * target is not part of source.
	 * 
	 * @param source
	 *            string to be scanned.
	 * @param target
	 *            string containing the sequence of characters to match.
	 */
	public static int strStr(String source, String target) {
		if (source == null || target == null || !source.contains(target)) {
			System.err.println(-1);
			return -1;
		}
		if (source.equals(target)) {
			System.err.println(0);
			return 0;
		}
		int firtOccu = 0;
		String[] s = source.split(target);
		for (int i = 0; i < s.length; i++) {
			String firstString = s[i];
			firtOccu = firstString.length();
			System.err.println(firtOccu);
			return firtOccu;
		}
		System.err.println(-1);
		return -1;

	}
}
