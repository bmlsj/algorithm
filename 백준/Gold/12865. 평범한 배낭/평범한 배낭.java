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

		int[] weights = new int[N + 1]; // 무게 배열
		int[] profits = new int[N + 1]; // 가치 배열

		// 1. 동적 테이블 생성
		int[][] D = new int[N + 1][K + 1];

		for (int i = 1; i <= N; i++) {
			split = in.readLine().split(" ");
			weights[i] = Integer.parseInt(split[0]);
			profits[i] = Integer.parseInt(split[1]);
		}

		int itemWeight = 0;
		int itemBenefit = 0;

		for (int item = 1; item <= N; item++) {
			itemWeight = weights[item]; // 현 아이템의 무게
			itemBenefit = profits[item]; // 현 아이템의 가치

			// 점화식을 이용하여, 1부터 목표무게까지의 가치 테이블을 만든다.
			for (int weight = 1; weight <= K; weight++) {
				// 현 아이템을 선택할 경우(배낭에 담을 수 있는 경우)
				if (itemWeight <= weight) {

					// 현 아이템을 배낭에 담지 않았을 때 가치(이전 물건까지 담았을 때의 최적해)
					// 현 아이템을 배낭에 담았을 때의 가치 (새롭게 구한 최적해) 중 유리한 가치를 저장
					D[item][weight] = Math.max(D[item - 1][weight], itemBenefit + D[item - 1][weight - itemWeight]);
				}

				// 현 아이템을 선택하지 않는 경우(배낭에 담을 수 없는 경우)
				else {
					// 이전까지 고려한 물건들의 가치를 그대로 사용
					D[item][weight] = D[item - 1][weight];

				}
			}
		}

		// 결과 출력
		System.out.println(D[N][K]);

	}
}