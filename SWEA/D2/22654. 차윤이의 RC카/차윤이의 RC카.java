import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

	private static int N, Q, T;
	private static char[][] map;
	private static char[] command;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			StringBuilder sb = new StringBuilder();
			N = Integer.parseInt(in.readLine());
			map = new char[N][N];
			int sx = -1, sy = -1;

			for (int i = 0; i < N; i++) {
				String line = in.readLine();
				for (int j = 0; j < N; j++) {
					map[i][j] = line.charAt(j);
					if (map[i][j] == 'X') {
						sx = i;
						sy = j;
					}
				}
			}

			Q = Integer.parseInt(in.readLine()); // 조종 횟수
			for (int i = 0; i < Q; i++) {
				String[] split = in.readLine().split(" ");
				command = split[1].toCharArray(); // command에 값을 저장

				int ans = go(command, sx, sy, 0);
				sb.append(ans + " ");
			}

			System.out.println("#" + t + " " + sb.toString());
		}
	}

	private static int[] dx = { -1, 0, 1, 0 }; // 상우하좌
	private static int[] dy = { 0, 1, 0, -1 };

	private static int go(char[] command, int x, int y, int dir) {

		for (int idx = 0; idx < command.length; idx++) {

			if (command[idx] == 'L') { // 왼쪽으로 90도 회전
				dir = (dir + 3) % 4;
			} else if (command[idx] == 'R') {
				dir = (dir + 1) % 4;
			} else if (command[idx] == 'A') {

				int nx = x + dx[dir];
				int ny = y + dy[dir];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N) {
					continue;
				}

				if (map[nx][ny] != 'T') {
					x = nx;
					y = ny;
				}
			}
		}

		return map[x][y] == 'Y' ? 1 : 0;
	}
}