import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	private static int T;
	private static long N;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			N = Long.parseLong(in.readLine()); // 테스트 케이스 개수
			long cnt = 0;

			while (N != 2) {

				double num = Math.sqrt(N);
				if (num == (long) num) { // 정수이면
					N = (long) num;
					cnt++;
				} else { // 시간 초과때문에, 횟수를 바로 구할 수 있게 함
					long next = ((long) num + 1) * ((long) num + 1);
					cnt += next - N; // 필요한 연산 횟수
					N = next;
				}
			}

			System.out.printf("#%d %d\n", t, cnt);
		}

	}

}