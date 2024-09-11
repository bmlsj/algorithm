import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	private static int[][] bags;
	private static int N, K;
	private static int maxVal;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String[] split = in.readLine().split(" ");

		N = Integer.parseInt(split[0]); // 물품 수
		K = Integer.parseInt(split[1]); // 버틸 수 있는 무게

		// 1. 동적 테이블 생성
		int[][] items = new int[N + 1][K + 1];

		for (int i = 1; i <= N; i++) {
			split = in.readLine().split(" ");
			int itemWeight = Integer.parseInt(split[0]); // 무게
			int itemBenefit = Integer.parseInt(split[1]); // 가치

			for (int w = 1; w <= K; w++) {
				if (itemWeight <= w) {

					items[i][w] = Math.max(items[i - 1][w], itemBenefit + items[i - 1][w - itemWeight]);
				}

				else {
					items[i][w] = items[i - 1][w];

				}
			}
		}

		// 결과 출력
		System.out.println(items[N][K]);

	}
}