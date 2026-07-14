import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	static final long MOD = 998244353;
	static final long INV_2 = 499122177; // 2의 모듈러 역원 (MOD + 1) / 2

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		for (int t = 1; t <= tc; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			long c = Long.parseLong(st.nextToken());

			long sumA = getSum(a);
			long sumB = getSum(b);
			long sumC = getSum(c);

			// 각 합을 곱하며 나누는 모듈러 연산
			long ans = (sumA * sumB) % MOD;
			ans = (ans * sumC) % MOD;

			System.out.println(ans);
		}
	}

	// 1부터 N까지의 합을 MOD 연산을 적용하여 구하는 메서드
	private static long getSum(long n) {
		long first = n % MOD;
		long second = (n + 1) % MOD;
		long total = (first * second) % MOD;
		return (total * INV_2) % MOD;
	}
}