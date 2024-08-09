import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {

	private static boolean[][] visited;
	private static int[] dx = { 0, 0, -1, 1 };
	private static int[] dy = { 1, -1, 0, 0 };
	private static int[][] map;

	public static void main(String[] args) throws Exception {

		// System.setIn(new FileInputStream("1226_input.txt"));
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 0; t < 10; t++) {
			int n = Integer.parseInt(in.readLine());

			map = new int[16][16];
			int sX = 0, sY = 0;
			for (int i = 0; i < 16; i++) {
				String[] input = in.readLine().split("");
				for (int j = 0; j < input.length; j++) {
					map[i][j] = Integer.parseInt(input[j]);
					if (map[i][j] == 2) {
						sX = i;
						sY = j;
						break;
					}
				}
			}

			visited = new boolean[16][16];

			System.out.printf("#%d %d\n", n, bfs(sX, sY));

		}
	}

	private static int bfs(int sX, int sY) {

		Queue<int[]> queue = new ArrayDeque<>();
		queue.offer(new int[] { sX, sY });
		visited[sX][sY] = true;

		int x = sX, y = sY;
		while (!queue.isEmpty()) {

			int[] xy = queue.poll();
			x = xy[0];
			y = xy[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= 16 || ny < 0 || ny >= 16) {
					continue;
				}

				if (map[nx][ny] == 3) {
					return 1;
				}
				if (!visited[nx][ny] && map[nx][ny] == 0) {
					queue.add(new int[] { nx, ny });
					visited[nx][ny] = true;
				}

			}
		}

		return 0;

	}
}