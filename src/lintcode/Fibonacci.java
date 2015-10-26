package lintcode;

public class Fibonacci {
	public static void main(String[] args) {

		System.err.println(fibonacci(47));
	}

	private static int fibonacci(int n) {
		if (n == 1) {
			return 0;
		}
		if (n == 2 || n == 3) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

}
