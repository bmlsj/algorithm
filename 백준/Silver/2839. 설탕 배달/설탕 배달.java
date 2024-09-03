import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	final static int INF = 5001;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());

		int[] group = { 3, 5 };

		int[] dp = new int[n + 1];
		for (int i = 0; i < n + 1; i++) {
			dp[i] = INF;
		}

		dp[0] = 0;
		for (int g : group) {
			for (int i = g; i < n + 1; i++) {
				dp[i] = Math.min(dp[i], dp[i - g] + 1);
			}
		}
		System.out.println(dp[n] == INF ? -1 : dp[n]);

	}

}