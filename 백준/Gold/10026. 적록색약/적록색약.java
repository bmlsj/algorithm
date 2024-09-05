import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

	static String[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(in.readLine());

		map = new String[n][n];
		for (int i = 0; i < n; i++) {
			String[] split = in.readLine().split("");
			for (int j = 0; j < n; j++) {
				map[i][j] = split[j];
			}
		}

		visited = new boolean[n][n];
		int cnt = 0, gcnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && map[i][j].equals("B")) {
					dfs(i, j, "B");
					cnt++;
				} else if (!visited[i][j] && map[i][j].equals("R")) {
					dfs(i, j, "R");
					cnt++;
				} else if (!visited[i][j] && map[i][j].equals("G")) {
					dfs(i, j, "G");
					cnt++;
				}
			}
		}

		visited = new boolean[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (!visited[i][j] && map[i][j].equals("B")) {
					dfs(i, j, "B");
					gcnt++;
				} else if (!visited[i][j] && map[i][j].equals("G")) {
					dfs(i, j, "G");
					gcnt++;
				}
			}
		}

		System.out.println(cnt + " " + gcnt);

	}

	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	private static void dfs(int x, int y, String target) {

		visited[x][y] = true;
		if (target.equals("R") && map[x][y].equals("R")) {
			map[x][y] = "G";
		}
		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (isRange(nx, ny, target)) {
				visited[nx][ny] = true;
				dfs(nx, ny, target);
			}
		}
	}

	static boolean isRange(int x, int y, String target) {
		if (x < 0 || x >= map.length || y < 0 || y >= map[0].length) {
			return false;
		}
		if (!visited[x][y] && map[x][y].equals(target)) {
			return true;
		}
		return false;
	}

}