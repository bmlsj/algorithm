import java.io.BufferedReader;
import java.io.InputStreamReader;

// C(m, n) = m! / (n! * (m - n)!)
public class Main {

	private static int[][] dp;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int t = 0; t < T; t++) {
			String[] split = in.readLine().split(" ");
			int n = Integer.parseInt(split[0]); // 선택할 개수
			int m = Integer.parseInt(split[1]); // 전체 개수

			dp = new int[30][30];
			// 조합의 수를 계산하여 출력
			System.out.println(combi(m, n));
		}
	}

	private static int combi(int n, int r) {

		if (n == r || r == 0) {
			return dp[n][r] = 1;
		}
		if (dp[n][r] > 0) {
			return dp[n][r];
		}
        dp[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
		return dp[n][r];
	}
}