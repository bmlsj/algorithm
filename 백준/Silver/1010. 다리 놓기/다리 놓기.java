import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

// C(m, n) = m! / (n! * (m - n)!)
public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());

		for (int t = 0; t < T; t++) {
			String[] split = in.readLine().split(" ");
			int n = Integer.parseInt(split[0]); // 선택할 개수
			int m = Integer.parseInt(split[1]); // 전체 개수

			// 조합의 수를 계산하여 출력
			System.out.println(combi(m, n));
		}
	}

	// 이항 계수를 계산하는 메서드
	private static BigInteger combi(int m, int n) {
		if (n > m) {
			return BigInteger.ZERO;
		}
		BigInteger numerator = fac(m);
		BigInteger denominator = fac(n).multiply(fac(m - n));
		return numerator.divide(denominator);
	}

	// 팩토리얼을 계산하는 메서드
	private static BigInteger fac(int num) {
		BigInteger result = BigInteger.ONE;
		for (int i = 2; i <= num; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}