package mathandbitmanipulation;

public class UniquePaths {
	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		int nums = uniquePaths(m, n);
		System.err.println(nums);
	}

	private static int uniquePaths(int m, int n) {

        // 经典DP题
        // 1. 状态表达式: D[i][j]: 代表从起点到这一点的所有的路径数目
        // 2. 递推公式:   D[i][j] = D[i - 1][j] + D[i][j - 1]
        // 3. 初始化: D[0][0] = 1 原点只有一种方法到达
		int[][] a = new int[m][n];
		for (int i = 0; i < m; i++) {
			a[i][0] = 1;
		}
		for (int i = 0; i < n; i++) {
			a[0][i] = 1;
		}
		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				a[i][j] = a[i - 1][j] + a[i][j - 1];
			}
		}
		return a[m - 1][n - 1];
	}
}
