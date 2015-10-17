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
 * 容易 字符串查找
 * 
 * 18% 通过 字符串查找（又称查找子字符串），是字符串操作中一个很有用的函数。你的任务是实现这个函数。
 * 
 * 对于一个给定的 source 字符串和一个 target 字符串，你应该在 source 字符串中找出 target 字符串出现的第一个位置(从0开始)。
 * 
 * 如果不存在，则返回 -1。
 * 
 * 您在真实的面试中是否遇到过这个题？ Yes 样例 如果 source = "source" 和 target = "target"，返回 -1。
 * 
 * 如果 source = "abcdabcdefg" 和 target = "bcd"，返回 1。
 * 
 * 挑战 O(n2)的算法是可以接受的。如果你能用O(n)的算法做出来那更加好。（提示：KMP）
 * 
 * 说明 在面试中我是否需要实现KMP算法？
 * 
 * 不需要，当这种问题出现在面试中时，面试官很可能只是想要测试一下你的基础应用能力。当然你需要先跟面试官确认清楚要怎么实现这个题。
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
