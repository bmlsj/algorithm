import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Map;
import java.util.Queue;

public class Main {

	private static int n, m;
	private static int[][] map;
	private static int[][] dp;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		n = Integer.parseInt(split[0]);
		m = Integer.parseInt(split[1]);

		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			split = in.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		}

		dp = new int[n][m];
		dp[0][0] = map[0][0];

		for (int i = 1; i < n; i++) {
			dp[i][0] = dp[i - 1][0] + map[i][0];
		}

		for (int j = 1; j < m; j++) {
			dp[0][j] = dp[0][j - 1] + map[0][j];
		}

		// DP 테이블 채우기
		for (int i = 1; i < n; i++) {
			for (int j = 1; j < m; j++) {
				dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + map[i][j];
			}
		}
		System.out.println(dp[n - 1][m - 1]);

	}

}