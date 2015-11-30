package binarysearch;

public class sqrt {
	public static void main(String[] args) {
		int i = 11;
		int r = sqrt(i);
		System.err.println(r);
	}

	private static int sqrt(int i) {
		Double temp = Math.sqrt(i);
		int result =temp.intValue();
		return result;
	}
}
