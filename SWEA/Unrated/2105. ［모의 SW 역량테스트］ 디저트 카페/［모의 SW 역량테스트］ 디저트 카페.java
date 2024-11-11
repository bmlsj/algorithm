import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {

	private static int T, N;
	private static int[][] map;
	private static boolean[] desserts;
	private static boolean[][] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());
		String[] split;

		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(in.readLine());

			map = new int[N][N];

			for (int i = 0; i < N; i++) {
				split = in.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(split[j]);
				}
			}

			ans = -1;
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					visited = new boolean[N][N];
					desserts = new boolean[101];
					visited[i][j] = true;
					desserts[map[i][j]] = true;
					eat(i, j, i, j, 1, 0);
				}
			}

			System.out.println("#" + t + " " + ans);

		}
	}

	private static int[] dx = { 1, 1, -1, -1 };
	private static int[] dy = { -1, 1, 1, -1 };
	private static int ans;

	private static void eat(int sx, int sy, int x, int y, int cnt, int dir) {

		for (int i = dir; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx == sx && ny == sy && cnt >= 4) { // 시작점으로 돌아왔을 때
				ans = Math.max(ans, cnt);

				return;

			}

			if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
				continue;
			}

			if (!visited[nx][ny] && !desserts[map[nx][ny]]) {
				visited[nx][ny] = true;
				desserts[map[nx][ny]] = true;
				eat(sx, sy, nx, ny, cnt + 1, i);
				visited[nx][ny] = false;
				desserts[map[nx][ny]] = false;
			}
		}

	}

}