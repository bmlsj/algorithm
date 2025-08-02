import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Queue;

/*
 * 🧭 풀이 방향 (전략 위주)
1. 벽 3개를 조합으로 세워본다
먼저, 빈 칸(0) 중에서 3개를 선택해서 벽을 세우는 **조합(Combination)**을 구해야 해.

벽 3개를 세울 수 있는 모든 경우의 수를 고려해야 해.
예: DFS 또는 for 3중 루프 또는 List<Point>로 조합 구현.

2. 각 조합마다 바이러스 퍼뜨리기 (BFS/DFS)
벽을 세운 다음에는, 바이러스(2)가 퍼질 수 있도록 시뮬레이션을 해야 해.

이 부분에서 BFS를 이용해 2가 사방으로 퍼지도록 시뮬레이션을 수행함.

3. 퍼진 뒤 안전영역(0 개수) 세기
바이러스가 퍼진 이후 **남아 있는 0의 개수(=안전 영역)**를 세고, 이 값들 중 최대값을 업데이트 해줘야 해.

4. 최대 안전영역 출력
 */

public class Main {

	private static int N, M;
	private static int[][] map;
	private static List<Point> blanks;

	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}

	// 0: 빈칸, 1: 벽, 2: 바이러스
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] split = br.readLine().split(" ");

		N = Integer.parseInt(split[0]);
		M = Integer.parseInt(split[1]);

		map = new int[N][M];

		blanks = new ArrayList<>();
		for (int i = 0; i < N; i++) {
			split = br.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(split[j]);
				if (map[i][j] == 0) { // 빈칸
					blanks.add(new Point(i, j));
				}
			}
		}

		combination(0, 0);
		System.out.println(maxAns);
	}

	static int maxAns = Integer.MIN_VALUE;

	static void combination(int start, int depth) {

		if (depth == 3) {

			// map을 복사
			int[][] copyMap = new int[N][M];
			for (int i = 0; i < N; i++) {
				System.arraycopy(map[i], 0, copyMap[i], 0, M);
			}

			// 바이러스 퍼트리기
			spreadVirus(copyMap);

			// 안전 영역 계산
			int cnt = countArea(copyMap);
			maxAns = Math.max(maxAns, cnt);

			return;
		}

		for (int i = start; i < blanks.size(); i++) {
			Point pos = blanks.get(i);
			map[pos.x][pos.y] = 1; // 벽o
			combination(i + 1, depth + 1);
			map[pos.x][pos.y] = 0; // 벽X
		}

	}

	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };

	static int countArea(int[][] copyMap) {

		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (copyMap[i][j] == 0) {
					cnt++;
				}
			}
		}

		return cnt;
	}

	static void spreadVirus(int[][] copyMap) {

		Queue<Point> virus = new ArrayDeque<Point>();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (copyMap[i][j] == 2) {
					virus.offer(new Point(i, j));
				}
			}
		}

		while (!virus.isEmpty()) {

			Point pos = virus.poll();
			for (int i = 0; i < 4; i++) {
				int nx = pos.x + dx[i];
				int ny = pos.y + dy[i];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
					continue;
				}

				if (copyMap[nx][ny] == 0) {
					copyMap[nx][ny] = 2;
					virus.offer(new Point(nx, ny));
				}
			}

		}
	}

}