import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

// x의 범위가 -100에서 100이므로 이차원 배열에 넣기 위해 0 ~ 200 으로 생성해야함
public class Solution {

	private static int T;

	private static int[] dx = { -1, 1, 0, 0 }; // 세로, 가로
	private static int[] dy = { 0, 0, -1, 1 };
	private static boolean[][][] visited;
	private static int x2, y2;

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");

			int x1 = Integer.parseInt(split[0]) + 100;
			int y1 = Integer.parseInt(split[1]) + 100;
			x2 = Integer.parseInt(split[2]) + 100;
			y2 = Integer.parseInt(split[3]) + 100;

			visited = new boolean[201][201][2];
			int ans = bfs(x1, y1);
			System.out.printf("#%d %d\n", t, ans);

		}

	}

	private static int bfs(int x1, int y1) {

		Queue<int[]> queue = new ArrayDeque<int[]>();

		// 세로
		queue.offer(new int[] { x1, y1, 0, 0 });
		visited[x1][y1][0] = true;

		// 가로
		queue.offer(new int[] { x1, y1, 0, 1 });
		visited[x1][y1][1] = true;

		while (!queue.isEmpty()) {
			int[] curr = queue.poll();

			x1 = curr[0];
			y1 = curr[1];
			int move = curr[2];
			int dir = curr[3];

			if (x1 == x2 && y1 == y2) {
				return move;
			}

			// 세로
			if (dir == 0) {
				// 가로로 이동
				for (int i = 2; i < 4; i++) {
					int nx = x1 + dx[i];
					int ny = y1 + dy[i];

					if (nx < 0 || ny < 0 || nx >= 201 || ny >= 201 || visited[nx][ny][1]) {
						continue;
					}

					visited[nx][ny][1] = true;
					queue.offer(new int[] { nx, ny, move + 1, 1 });
				}
			} else {
				// 세로로 이동
				for (int i = 0; i < 2; i++) {
					int nx = x1 + dx[i];
					int ny = y1 + dy[i];

					if (nx < 0 || ny < 0 || nx >= 201 || ny >= 201 || visited[nx][ny][0]) {
						continue;
					}

					visited[nx][ny][0] = true;
					queue.offer(new int[] { nx, ny, move + 1, 0 });
				}
			}
		}
		return -1;
	}

}
