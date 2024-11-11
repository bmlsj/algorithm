import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {

	private static int T, R, C;
	private static char[][] map;
	private static boolean[][][][] visited;
	private static int[] dx = { 0, 1, 0, -1 }; // 우하좌상
	private static int[] dy = { 1, 0, -1, 0 };

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {
			String[] split = in.readLine().split(" ");
			R = Integer.parseInt(split[0]);
			C = Integer.parseInt(split[1]);

			map = new char[R][C];
			for (int i = 0; i < R; i++) {
				String line = in.readLine();
				for (int j = 0; j < C; j++) {
					map[i][j] = line.charAt(j);
				}
			}

			visited = new boolean[R][C][4][16]; // 초기화
			boolean ans = bfs();
			System.out.println("#" + t + " " + (ans ? "YES" : "NO"));

		}
	}

	private static boolean bfs() {

		Queue<int[]> queue = new ArrayDeque<int[]>();
		queue.offer(new int[] { 0, 0, 0, 0 }); // x, y, dir, mem

		while (!queue.isEmpty()) {

			int[] curr = queue.poll();
			int x = curr[0];
			int y = curr[1];
			int dir = curr[2];
			int mem = curr[3];

			// 방문 체크
			if (visited[x][y][dir][mem])
				continue;
			visited[x][y][dir][mem] = true;

			switch (map[x][y]) {
			case '<': // 왼쪽으로 방향 변경(우하좌상)
				dir = 2;
				break;
			case '>':
				dir = 0;
				break;
			case '^':
				dir = 3;
				break;
			case 'v':
				dir = 1;
				break;
			case '_': // 메모리에 0이 저장 오른쪽, 아니면 왼쪽
				dir = (mem == 0) ? 0 : 2;
				break;
			case '|': // 메모리에 0이 저장 아래쪽, 아니면 위쪽
				dir = (mem == 0) ? 1 : 3;
				break;
			case '?':
				for (int i = 0; i < 4; i++) { // ?에 대해 모든 방향 시도
					int nx = (x + dx[i] + R) % R;
					int ny = (y + dy[i] + C) % C;
					queue.offer(new int[] { nx, ny, i, mem });
				}
				continue;
			case '@': // 프로그램 실행 정지
				return true;
			case '+':
				mem = (mem == 15) ? 0 : mem + 1;
				break;
			case '-':
				mem = (mem == 0) ? 15 : mem - 1;
				break;
			default:
				if (Character.isDigit(map[x][y])) { // 숫자인 경우
					mem = map[x][y] - '0';
				}
			}

			int nx = (x + dx[dir] + R) % R;
			int ny = (y + dy[dir] + C) % C;
			queue.offer(new int[] { nx, ny, dir, mem });
		}
		return false;
	}

}