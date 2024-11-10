import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {

	private static int T, N, X, M;
	private static int[] combi, ansList;
	private static int totalSum;
	private static int[][] record;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			String[] split = in.readLine().split(" ");
			N = Integer.parseInt(split[0]); // 우리 수
			X = Integer.parseInt(split[1]); // 최대 햄수터 수
			M = Integer.parseInt(split[2]); // 기록

			combi = new int[N];
			ansList = new int[N];
			record = new int[M][3];
			ansList[0] = -1;

			totalSum = -1;

			for (int i = 0; i < M; i++) {
				split = in.readLine().split(" ");

				int to = Integer.parseInt(split[0]) - 1;
				int from = Integer.parseInt(split[1]) - 1;
				int hamCnt = Integer.parseInt(split[2]);

				record[i] = new int[] { to, from, hamCnt };
			}

			woriCheck(0);
			System.out.print("#" + t + " ");

			if (ansList[0] == -1) {
				System.out.println(-1);
			} else {
				for (int i = 0; i < N; i++) {
					System.out.print(ansList[i] + " ");
				}
				System.out.println();
			}
		}
	}

	private static boolean isChecked(int idx) {
		int sum = 0;
		for (int i = record[idx][0]; i <= record[idx][1]; i++) {
			sum += combi[i];
		}
		return sum == record[idx][2];
	}

	private static void woriCheck(int cnt) {

		if (N == cnt) {

			for (int i = 0; i < M; i++) {
				if (!isChecked(i)) {
					return;
				}
			}

			int sum = 0;
			for (int i = 0; i < N; i++) {
				sum += combi[i];
			}

			if (totalSum < sum) { // 햄스터 수가 더 많을 경우
				totalSum = sum;
				ansList = Arrays.copyOf(combi, N);
			}
			return;
		}

		for (int i = 0; i <= X; i++) { // 0부터 X까지 모든 값을 시도
			combi[cnt] = i;
			woriCheck(cnt + 1);
		}
	}
}