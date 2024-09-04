import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	private static String[][] map;
	private static boolean[][] visited;
	private static int r, c;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		r = Integer.parseInt(split[0]);
		c = Integer.parseInt(split[1]);

		map = new String[r][c];
		for (int i = 0; i < r; i++) {
			split = in.readLine().split("");
			for (int j = 0; j < c; j++) {
				map[i][j] = split[j];
			}
		}

		visited = new boolean[r][c];
		int cnt = 0;
		for (int i = 0; i < r; i++) {
			if (dfs(i, 0)) {
				cnt++;
//				for (boolean[] v : visited) {
//					System.out.println(Arrays.toString(v));
//				}
			}

		}

		System.out.println(cnt);

	}

	private static int[] dx = { -1, 0, 1 }; // 우상, 오, 우하
	private static int[] dy = { 1, 1, 1 };

	private static boolean dfs(int x, int y) {

		visited[x][y] = true;
		if (y == c - 1) {
			return true;
		}

		for (int i = 0; i < 3; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx < 0 || nx >= r || ny < 0 || ny >= c) {
				continue;
			}

			if (!visited[nx][ny] && map[nx][ny].equals(".")) {
				visited[nx][ny] = true;
				if (dfs(nx, ny)) {
					return true;
				}
			}
		}

		return false;
	}

}