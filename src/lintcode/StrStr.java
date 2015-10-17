package lintcode;

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
