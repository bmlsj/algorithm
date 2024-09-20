import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution {

	private static int[][] map;
	private static int[][] visited;
	private static int n;

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(in.readLine());
		StringTokenizer st;

		for (int t = 1; t <= T; t++) {

			n = Integer.parseInt(in.readLine());
			map = new int[n][n];
			visited = new int[n][n];

			for (int i = 0; i < n; i++) {
				st = new StringTokenizer(in.readLine());
				for (int j = 0; j < n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			maxLen = -1;
			minStart = map[0][0];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					int len = start(i, j);
					if (maxLen < len || (len == maxLen && minStart >= map[i][j])) {
						maxLen = len;
						minStart = map[i][j];
					}
				}
			}

			System.out.printf("#%d %d %d\n", t, minStart, maxLen);
		}

	}

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, 1, -1 };
	private static int maxLen; // 최디 이동 거리
	private static int minStart; // 최소 시작값

	private static int start(int x, int y) {

		int len = 1;

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
				continue;
			}

			if (map[x][y] + 1 == map[nx][ny]) {
				len = Math.max(len, start(nx, ny) + 1);
			}
		}

		return len;

	}

}