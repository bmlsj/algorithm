import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

// 1. 정확히 3개의 벽을 배치할 수 있는 모든 조합 생성
// 2. 벽을 배치하고 시뮬레이션을 실행
// 3. 바이러스가 퍼지는 것을 BFS/DFS로 시뮬레이션
// 4. 시뮬레이션 후 안전한 공간을 계산
// 5. 최종적으로 안전한 공간의 최대값을 저장

class Main {

	static int[][] map;
	static boolean[][] visited;
	static int N, M, ans = -1;
	static List<int[]> emptyArr = new ArrayList<int[]>();

	// visited[][][] 로 벽 세우기
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");
		N = Integer.parseInt(split[0]);
		M = Integer.parseInt(split[1]);

		map = new int[N][M];
		for (int i = 0; i < N; i++) {
			split = in.readLine().split(" ");
			for (int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(split[j]);

				if (map[i][j] == 0) { // 벽을 세우기 위한 빈공간 좌표
					emptyArr.add(new int[] { i, j });
				}
			}
		}

		List<int[]> walls = new ArrayList<int[]>();
		combWall(0, 0, walls);
		System.out.println(ans);
	}

	// 랜덤으로 3개 벽을 세우기 위한 좌표
	private static void combWall(int depth, int start, List<int[]> walls) {

		if (depth == 3) {
			simulation(walls); // 벽을 세운 3개의 좌표로 시뮬레이션 돌림
			return;
		}

		for (int i = start; i < emptyArr.size(); i++) {
			int[] space = emptyArr.get(i);
			walls.add(space);

			combWall(depth + 1, i + 1, walls);
			walls.remove(walls.size() - 1);

		}
	}

	// 3개의 벽
	private static void simulation(List<int[]> walls) {

		int[][] tempMap = new int[N][M]; // 원본 맵으로 다시 되돌리기 위해 맵을 복사
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				tempMap[i][j] = map[i][j];
			}
		}

		for (int i = 0; i < walls.size(); i++) { // 3개의 벽 좌표를 1로 만듦
			int x = walls.get(i)[0];
			int y = walls.get(i)[1];

			tempMap[x][y] = 1;
		}

		// 바이러스 퍼트리기
		spreadVirus(tempMap);

		// 바이러스 퍼진 후 안전한 구역 최대 수 세기
		int safeArea = countSafeArea(tempMap);
		ans = Math.max(ans, safeArea);

	}

	// 안전한 공간 세기
	private static int countSafeArea(int[][] tempMap) {
		int cnt = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (tempMap[i][j] == 0) {
					cnt++;
				}
			}
		}

		return cnt;
	}

	// 바이러스를 퍼트리는 함수
	private static void spreadVirus(int[][] tempMap) {

		visited = new boolean[N][M];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (tempMap[i][j] == 2 && !visited[i][j]) { // 바이러스이고, 방문하지 않았을 때
					bfs(i, j, tempMap);
				}
			}
		}
	}

	private static int[] dx = { -1, 1, 0, 0 };
	private static int[] dy = { 0, 0, -1, 1 };

	private static void bfs(int x, int y, int[][] tempMap) {

		Queue<int[]> queue = new ArrayDeque<int[]>();
		queue.add(new int[] { x, y });
		visited[x][y] = true;

		while (!queue.isEmpty()) {
			int[] curr = queue.poll();
			x = curr[0];
			y = curr[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || ny < 0 || nx >= N || ny >= M) {
					continue;
				}

				if (!visited[nx][ny] && tempMap[nx][ny] == 0) {
					tempMap[nx][ny] = 2;
					visited[nx][ny] = true;
					queue.offer(new int[] { nx, ny });

				}
			}

		}

	}

}