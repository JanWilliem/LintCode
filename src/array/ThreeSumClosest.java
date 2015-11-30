package array;

import java.util.Arrays;

/**
 * @param numbers
 *            : Give an array numbers of n integer
 * @param target
 *            : An integer
 * @return : return the sum of the three integers, the sum closest target.
 */
public class ThreeSumClosest {
	public static void main(String[] args) {
		int[] s = { -1, 2, 1, -4 };
		int target = 1;
		threeSumClosest(s, target);
	}

	private static int threeSumClosest(int[] numbers, int target) {
		if (numbers == null) {
			return 0;
		}
		Arrays.sort(numbers);
		int sum = Integer.MAX_VALUE;
		int numlen = numbers.length;
		for (int i = 0; i < numlen; i++) {
			int left = i + 1;
			int right = numlen - 1;
			while (left < right) {
				int tmpsum = numbers[i] + numbers[left] + numbers[right];
				int tmpdist = tmpsum - target;
				sum = Math.abs(tmpdist) > Math.abs(sum - target) ? sum : tmpsum;
				if (tmpdist == 0) {
					return target;
				}
				if (tmpdist < 0) {
					left++;
				} else {
					right--;
				}
			}
		}
		return sum;
	}
}
