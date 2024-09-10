import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int x = Integer.parseInt(in.readLine());

		int[] dp = new int[x + 1];
		for (int i = 2; i <= x; i++) {
			dp[i] = dp[i - 1] + 1;
			if (i % 2 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 2] + 1);
			}

			if (i % 3 == 0) {
				dp[i] = Math.min(dp[i], dp[i / 3] + 1);
			}
		}

		// System.out.println(Arrays.toString(dp));
		System.out.println(dp[dp.length - 1]);

	}
}