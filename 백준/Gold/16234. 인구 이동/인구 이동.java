import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

	static class Pair {
		int x, y;

		Pair(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	private static int N, L, R, cnt;
	private static int[][] population;
	private static int[] dx = { 0, 0, -1, 1 };
	private static int[] dy = { 1, -1, 0, 0 };
	private static ArrayList<Pair> union = new ArrayList<>();
	static boolean[][] visited;
	static boolean isMoved = false;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		N = Integer.parseInt(split[0]);
		L = Integer.parseInt(split[1]);
		R = Integer.parseInt(split[2]);

		population = new int[N][N];
		for (int i = 0; i < N; i++) {
			split = in.readLine().split(" ");
			for (int j = 0; j < N; j++) {
				population[i][j] = Integer.parseInt(split[j]);
			}
		}

		move();
		System.out.println(cnt);

	}

	private static void move() {

		while (true) {
			isMoved = false;
			visited = new boolean[N][N];

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j]) {
						bfs(i, j);
					}
				}
			}

			if (!isMoved)
				break; // 국경 이동이 없으면 종료
			else {
				cnt++; // 국경 이동이 있었다면, 일수 추가
			}
		}
	}

	private static void bfs(int x, int y) {

		Queue<Pair> q = new ArrayDeque<>();
		q.add(new Pair(x, y));
		visited[x][y] = true;
		union.add(new Pair(x, y));

		while (!q.isEmpty()) {

			Pair pair = q.poll();
			x = pair.x;
			y = pair.y;

			for (int k = 0; k < 4; k++) {
				int nx = x + dx[k];
				int ny = y + dy[k];

				if (0 > nx || nx >= N || 0 > ny || ny >= N) {
					continue;
				}

				if (!visited[nx][ny] && Math.abs(population[x][y] - population[nx][ny]) >= L
						&& Math.abs(population[x][y] - population[nx][ny]) <= R) {
					isMoved = true;
					visited[nx][ny] = true;
					union.add(new Pair(nx, ny));
					q.add(new Pair(nx, ny));
				}
			}
		}

		// bfs 끝나면, 인구이동 결과 맵에 집어넣기
		int sum = 0;
		for (int i = 0; i < union.size(); i++) {
			Pair pair = union.get(i);
			sum += population[pair.x][pair.y];
		}

		for (int i = 0; i < union.size(); i++) {
			Pair pair = union.get(i);
			population[pair.x][pair.y] = sum / union.size();
		}

		union.clear();
	}

}