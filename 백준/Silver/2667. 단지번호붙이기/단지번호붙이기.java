import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	private static int[][] map;
	private static boolean[][] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());
		map = new int[n][n];
		for (int i = 0; i < n; i++) {
			String[] split = in.readLine().split("");
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(split[j]);
			}
		}

		visited = new boolean[n][n];
		int cnt = 0;
		List<Integer> eachs = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && map[i][j] == 1) {
					each = 0;
					dfs(i, j, n);
					eachs.add(each);
					cnt++;
				}
			}
		}

		System.out.println(cnt);
		Collections.sort(eachs);
		for (Integer a : eachs) {
			System.out.println(a);
		}

	}

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };
	static int cnt = 0;
	static int each;

	private static void dfs(int x, int y, int n) {

		visited[x][y] = true;
		each++;
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || ny < 0 || nx >= n || ny >= n) {
				continue;
			}

			if (!visited[nx][ny] && map[nx][ny] == 1) {
				visited[nx][ny] = true;

				dfs(nx, ny, n);
			}
		}

	}

}