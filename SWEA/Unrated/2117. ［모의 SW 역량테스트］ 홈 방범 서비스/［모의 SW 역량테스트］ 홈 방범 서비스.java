import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {

	private static int[][] map;
	private static int n, m;

	public static void main(String[] args) throws Exception {

	//	System.setIn(new FileInputStream("1263_input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");

			n = Integer.parseInt(split[0]); // 도시 크기
			m = Integer.parseInt(split[1]); // 집 지불 비용

			map = new int[n][n];

			// 도시 맵 입력
			for (int i = 0; i < n; i++) {
				String[] row = in.readLine().split(" ");
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(row[j]);
				}
			}

			int maxHouses = 0;

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					// 각 좌표에 대해 k 값을 1부터 n+1까지 시도
					for (int k = 1; k <= n + 1; k++) {
						int housesCovered = serviceArea(i, j, k);
						int serviceCost = k * k + (k - 1) * (k - 1);

						// 수익이 비용보다 크거나 같으면, 최대로 서비스할 수 있는 집의 수를 갱신
						if (housesCovered * m >= serviceCost) {
							maxHouses = Math.max(maxHouses, housesCovered);
						}
					}
				}
			}

			// 결과 출력
			System.out.println("#" + t + " " + maxHouses);
		}
	}

	// 다이아몬드 모양 서비스 범위 내의 집 수 계산
	public static int serviceArea(int sx, int sy, int k) {
		int houses = 0;

		// 다이아몬드 모양의 각 행을 계산
		for (int i = 0; i < k; i++) {
			int width = i; // 행의 좌우 폭 결정

			// 각 행에서 좌우 대칭으로 집을 확인
			for (int j = -width; j <= width; j++) {
				int newX1 = sx + j;
				int newY1 = sy - (k - 1) + i; // 다이아몬드 위쪽 부분 좌표
				int newY2 = sy + (k - 1) - i; // 다이아몬드 아래쪽 부분 좌표 (대칭)

				// 위쪽 다이아몬드 범위 내 집이 있으면 집의 수 증가
				if (newX1 >= 0 && newX1 < n && newY1 >= 0 && newY1 < n && map[newX1][newY1] == 1) {
					houses++;
				}

				// 아래쪽 대칭 부분 확인 (중복 방지를 위해 동일한 좌표는 제외)
				if (newX1 >= 0 && newX1 < n && newY2 >= 0 && newY2 < n && newY1 != newY2 && map[newX1][newY2] == 1) {
					houses++;
				}
			}
		}

		return houses;
	}
}