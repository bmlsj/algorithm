import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {

	private static int N, M, T;
	private static char[][] map;
	private static int[][] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");
			M = Integer.parseInt(split[0]);
			N = Integer.parseInt(split[1]);

			map = new char[M][N];
			Queue<int[]> lands = new ArrayDeque<>();

			visited = new int[M][N];
			for (int i = 0; i < M; i++) {
				String line = in.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == 'W') { // 물에서 거리 측정
						lands.offer(new int[] { i, j });
						visited[i][j] = 1;
					} else {
						visited[i][j] = 0; // 아직 방문하지 않은 육지
					}
				}
			}

			int ans = bfs(lands);

			System.out.printf("#%d %d\n", t, ans);

		}

	}

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };

	private static int bfs(Queue<int[]> queue) {

		int cnt = 0;
		while (!queue.isEmpty()) {
			int[] curr = queue.poll();

			int lx = curr[0];
			int ly = curr[1];

			for (int i = 0; i < 4; i++) {
				int nx = lx + dx[i];
				int ny = ly + dy[i];

				if (nx < 0 || ny < 0 || nx >= M || ny >= N) {
					continue;
				}

				// 아직 방문하지 않은 육지의 경우
				if (visited[nx][ny] == 0 && map[nx][ny] == 'L') {
					visited[nx][ny] = visited[lx][ly] + 1;
					cnt += visited[nx][ny] - 1;
					queue.offer(new int[] { nx, ny });
				}
			}

		}

		return cnt;

	}

}