import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

	private static int N;
	private static int[][] map, cost;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split;
		int idx = 1;

		while (true) {
			N = Integer.parseInt(in.readLine());
			if (N == 0)
				break;

			map = new int[N][N];
			cost = new int[N][N];
			for (int i = 0; i < N; i++) {
				split = in.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(split[j]);
					cost[i][j] = Integer.MAX_VALUE;
				}
			}

			int ans = cave();
			System.out.println("Problem " + (idx++) + ": " + ans);
		}

	}

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };

	private static int cave() {

		PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[2] - b[2]);
		queue.offer(new int[] { 0, 0, map[0][0] });
		cost[0][0] = map[0][0];

		while (!queue.isEmpty()) {

			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			int money = curr[2];

			if (x == N - 1 && y == N - 1) {
				return money;
			}

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
					continue;
				}

				int newCost = money + map[nx][ny];

				if (newCost < cost[nx][ny]) {
					cost[nx][ny] = newCost;
					queue.offer(new int[] { nx, ny, newCost });
				}
			}

		}

		return -1;

	}

}