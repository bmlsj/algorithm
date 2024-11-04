import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	private static int cnt; // 가능한 배치 수
	private static boolean[] isused_col; // 열 사용 여부
	private static boolean[] isused_dia1; // 대각선 1 (좌하향 대각선) 사용 여부
	private static boolean[] isused_dia2; // 대각선 2 (우하향 대각선) 사용 여부

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine()); // 테스트 케이스 개수

		for (int t = 1; t <= T; t++) {
			int n = Integer.parseInt(in.readLine()); // 체스판 크기 (n x n)
			cnt = 0;

			// 각 배열의 크기를 초기화
			isused_col = new boolean[n];       // 열 사용 여부 배열
			isused_dia1 = new boolean[2 * n];  // 대각선 1 사용 여부 배열
			isused_dia2 = new boolean[2 * n];  // 대각선 2 사용 여부 배열

			func(0, n); // 첫 번째 행부터 시작하여 퀸을 배치
			System.out.printf("#%d %d\n", t, cnt);
		}
	}

	// 백트래킹으로 퀸 배치
	private static void func(int curr, int n) {
		if (curr == n) { // n개의 퀸을 모두 놓았다면
			cnt++; // 가능한 배치 수 증가
			return;
		}

		for (int i = 0; i < n; i++) {
			// 현재 열, 대각선 사용 여부 확인
			if (isused_col[i] || isused_dia1[i + curr] || isused_dia2[curr - i + (n - 1)]) {
				continue;
			}

			// 퀸을 배치할 수 있다면, 해당 위치를 사용 처리
			isused_col[i] = true;
			isused_dia1[i + curr] = true;
			isused_dia2[curr - i + (n - 1)] = true;

			func(curr + 1, n); // 다음 행으로 이동

			// 백트래킹: 이전 상태로 되돌림
			isused_col[i] = false;
			isused_dia1[i + curr] = false;
			isused_dia2[curr - i + (n - 1)] = false;
		}
	}
}