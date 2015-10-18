package lintcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 中等 乱序字符串
 * 
 * 21% 通过
 * 给出一个字符串数组S，找到其中所有的乱序字符串(Anagram)。如果一个字符串是乱序字符串，那么他存在一个字母集合相同，但顺序不同的字符串也在S中。
 * 
 * 您在真实的面试中是否遇到过这个题？ Yes 样例 对于字符串数组 ["lint","intl","inlt","code"]
 * 
 * 返回 ["lint","inlt","intl"]
 * 
 * 注意 所有的字符串都只包含小写字母
 * 
 * @author wanghaidong
 *
 */
/**
 * Medium Anagrams
 * 
 * 21% Accepted Given an array of strings, return all groups of strings that are
 * anagrams.
 * 
 * Have you met this question in a real interview? Yes Example Given ["lint",
 * "intl", "inlt", "code"], return ["lint", "inlt", "intl"].
 * 
 * Given ["ab", "ba", "cd", "dc", "e"], return ["ab", "ba", "cd", "dc"].
 * 
 * Note All inputs will be in lower-case
 * 
 * @author wanghaidong
 *
 */
public class Anagrams {
	public static void main(String[] args) {
		String[] strs = { "lint", "intl", "inlt", "code" };

		anagrams(strs);
	}

	public static List<String> anagrams(String[] strs) {

		List<String> result = new ArrayList<String>();

		Map<String, ArrayList<String>> multiMap = new HashMap<String, ArrayList<String>>();

		for (String str : strs) {
			char[] strChar = str.toCharArray();
			Arrays.sort(strChar);
			String strSorted = String.valueOf(strChar);
			if (multiMap.containsKey(strSorted)) {
				ArrayList<String> aList = multiMap.get(strSorted);
				aList.add(str);
				multiMap.put(strSorted, aList);
			} else {
				ArrayList<String> aList = new ArrayList<String>();
				aList.add(str);
				multiMap.put(strSorted, aList);
			}
		}

		Set<String> keySet = multiMap.keySet();
		for (String key : keySet) {
			ArrayList<String> aList = multiMap.get(key);
			if (aList.size() > 1) {
				Collections.sort(aList);
				for (String string : aList) {
					result.add(string);
				}
			}

		}
		return result;

	}

}
