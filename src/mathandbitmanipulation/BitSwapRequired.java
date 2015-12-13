package mathandbitmanipulation;

public class BitSwapRequired {
	public static void main(String[] args) {
		int a = 31;
		int b = 14;
		int rr = bitSwapRequired(a, b);
		System.err.println(rr);
	}

	private static int bitSwapRequired(int a, int b) {
		int result = a ^ b;
		int len = 0;
		int shift = 1;
		while (shift != 0) {
			int temp = result & shift;
			if (temp != 0)
				len++;
			shift = shift << 1;
		}
		return len;
	}
}
