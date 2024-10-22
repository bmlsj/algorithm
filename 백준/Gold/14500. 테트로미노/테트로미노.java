import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static int[][] board;
	static boolean[][] visited;
	static int res = 0;
	static int[] dx = { 1, 0, -1, 0 };
	static int[] dy = { 0, 1, 0, -1 };

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		board = new int[N][M];
		visited = new boolean[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				visited[i][j] = true;
				dfs(i, j, 1, board[i][j]); // 'ㅗ' 를 제외한 도형 처리
				visited[i][j] = false;

				checkTShape(i, j); // 'ㅗ' 모양을 처리
			}
		}

		System.out.println(res);
	}

	static void dfs(int y, int x, int depth, int sum) {

		if (depth == 4) {
			res = Math.max(res, sum);
			return;
		}

		for (int i = 0; i < 4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (nx >= 0 && nx < M && ny >= 0 && ny < N && !visited[ny][nx]) {
				visited[ny][nx] = true;
				dfs(ny, nx, depth + 1, sum + board[ny][nx]);
				visited[ny][nx] = false;
			}
		}
	}

	static void checkTShape(int y, int x) {
		if (y >= 1 && x >= 1 && x < M - 1) { // 'ㅗ'
			int sum = board[y][x] + board[y][x - 1] + board[y][x + 1] + board[y - 1][x];
			res = Math.max(res, sum);
		}

		// 'ㅜ'
		if (x >= 1 && y < N - 1 && x < M - 1) {
			int sum = board[y][x] + board[y][x - 1] + board[y][x + 1] + board[y + 1][x];
			res = Math.max(res, sum);
		}

		// 'ㅏ'
		if (x < M - 1 && y < N - 1 && y >= 1) {
			int sum = board[y][x] + board[y - 1][x] + board[y + 1][x] + board[y][x + 1];
			res = Math.max(res, sum);
		}

		if (x >= 1 && y >= 1 && y < N - 1) {
			int sum = board[y][x] + board[y][x - 1] + board[y - 1][x] + board[y + 1][x];
			res = Math.max(res, sum);
		}
		// 추가적인 'ㅏ', 'ㅓ' 모양들에 대한 조건도 처리
	}
}