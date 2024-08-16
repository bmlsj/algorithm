import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//다익스트라 알고리즘
//1. 도둑루피를 가중치라고 생각하면, 가중치가 있는 그래프 문제이므로
//최단거리(최소비용)를 구하는 다익스트라 알고리즘을 이용
//2. 시작점이 정해진 경우는 다익스트라 알고리즘을 이용
//(플로이드 워샬 알고리즘은 모든 정점을 시작점으로 하기 때문)

public class Main {

	// 우, 하, 좌, 상
	private static final int[] dx = { 0, 1, 0, -1 };
	private static final int[] dy = { 1, 0, -1, 0 };
	

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int idx = 0;
		while (true) {

			int N = Integer.parseInt(in.readLine());
			if (N == 0)
				break;

			idx++;
			int[][] map = new int[N][N];

			for (int i = 0; i < N; i++) {
				String[] split = in.readLine().split(" ");
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(split[j]);
				}
			}

			int sx = 0, sy = 0; // 출발 정점

			// 다익스트라 알고리즘에 필요한 것들
			int[][] distance = new int[N][N]; // 출발지에서 자신으로 오는데 소요되는 최소 비용
			boolean[][] visited = new boolean[N][N]; // 최단 경로 포함 여부

			// 초기화
			for (int i = 0; i < N; i++) {
				Arrays.fill(distance[i], Integer.MAX_VALUE);
			}

			// 출발 정점 처리: 비용을 map의 시작점으로 저장
			distance[sx][sy] = map[sx][sy];

			for (int cnt1 = 0; cnt1 < N; cnt1++) {
				for (int cnt2 = 0; cnt2 < N; cnt2++) {

					// 1단계 : 미방문 정점 중 출발지에서 자신으로의 비용이 최소인 정점 선택
					// 방문 해야하는 나머지 정점 중 출발지에서 가장 가까운 정점 찾기
					int currx = -1, curry = -1;
					int min = Integer.MAX_VALUE;

					for (int i = 0; i < N; i++) {
						for (int j = 0; j < N; j++) {
							if (!visited[i][j] && distance[i][j] < min) {
								min = distance[i][j];
								currx = i;
								curry = j;
							}
						}
					}

					

					// 방문처리
					visited[currx][curry] = true; // 선택 정점 방문 처리
					
					// (선택사항) 가지치기 : 정점을 못찾은 경우는 종료
					if (currx == N - 1 && curry == N - 1) {
						break;
					}

					// 2단계 : 선택된 정점을 경유지로해 미방문 정점들로 가는 비용을 따져보고, 기존 최적해보다 유리하면 갱신
					// 4방향 탐색
					for (int i = 0; i < 4; i++) {
						int tx = currx + dx[i];
						int ty = curry + dy[i];

						// 경계 체크
						if ((tx >= 0 && tx < N) && (ty >= 0 && ty < N)) {
							if (!visited[tx][ty] && distance[tx][ty] > distance[currx][curry] + map[tx][ty]) {
								distance[tx][ty] = distance[currx][curry] + map[tx][ty];

							}
						}
					}

				}
			}

			System.out.printf("Problem %d: %d\n", idx, distance[N - 1][N - 1]);
			
		}

	}

}