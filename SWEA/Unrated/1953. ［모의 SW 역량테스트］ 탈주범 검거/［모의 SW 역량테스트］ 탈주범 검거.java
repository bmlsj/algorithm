import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.zip.Inflater;

public class Solution {

	private static int T, N, M, R, C, L;
	private static int[][] map;
	private static boolean[][] visited;
	private static int[][] possible = { {}, // 0번 파이프 (존재하지 않음)
			{ 0, 1, 2, 3 }, // 1번 파이프: 상하좌우
			{ 0, 1 }, // 2번 파이프: 상하
			{ 2, 3 }, // 3번 파이프: 좌우
			{ 0, 3 }, // 4번 파이프: 상우
			{ 1, 3 }, // 5번 파이프: 하우
			{ 1, 2 }, // 6번 파이프: 하좌
			{ 0, 2 } // 7번 파이프: 상좌
	};

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			String[] split = in.readLine().split(" ");
			N = Integer.parseInt(split[0]); // 세로
			M = Integer.parseInt(split[1]); // 가로
			R = Integer.parseInt(split[2]); // 맨홀 세로
			C = Integer.parseInt(split[3]); // 맨홀 가로
			L = Integer.parseInt(split[4]); // 소요 시간

			map = new int[N][M];
			visited = new boolean[N][M];

			for (int i = 0; i < N; i++) {
				split = in.readLine().split(" ");
				for (int j = 0; j < M; j++) {
					map[i][j] = Integer.parseInt(split[j]);
				}
			}

			int ans = bfs(R, C);
			System.out.println("#" + t + " " + ans);
		}

	}

	private static int[] dx = { -1, 1, 0, 0 }; // 상하좌우
	private static int[] dy = { 0, 0, -1, 1 };

	private static int bfs(int x, int y) {

		visited[x][y] = true;
		Queue<int[]> queue = new ArrayDeque<int[]>();
		queue.offer(new int[] { x, y, map[x][y], 1 });
		int count = 1;

		while (!queue.isEmpty()) {

			int[] curr = queue.poll();
			x = curr[0];
			y = curr[1];
			int pipe = curr[2];
			int time = curr[3];

			if (time >= L)
				continue;

			for (int dir : possible[pipe]) {

				int nx = x + dx[dir];
				int ny = y + dy[dir];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 0) {
					continue;
				}

				int nextPipe = map[nx][ny];
				boolean isConnected = false;
				for (int nextDir : possible[nextPipe]) {
					if (nextDir == (dir ^ 1)) {
						isConnected = true;
						break;
					}
				}

				if (isConnected) {
					visited[nx][ny] = true;
					queue.offer(new int[] { nx, ny, nextPipe, time + 1 });
					count++;
				}
			}
		}

		return count;

	}

}