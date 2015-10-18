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
 * �е� �����ַ���
 * 
 * 21% ͨ��
 * ����һ���ַ�������S���ҵ��������е������ַ���(Anagram)�����һ���ַ����������ַ�������ô������һ����ĸ������ͬ����˳��ͬ���ַ���Ҳ��S�С�
 * 
 * ������ʵ���������Ƿ�����������⣿ Yes ���� �����ַ������� ["lint","intl","inlt","code"]
 * 
 * ���� ["lint","inlt","intl"]
 * 
 * ע�� ���е��ַ�����ֻ����Сд��ĸ
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
