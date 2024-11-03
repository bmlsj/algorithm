import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	private static int T, N, M;
	private static List<Integer>[] graph;
	private static boolean[] visited;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(in.readLine());

		for (int t = 1; t <= T; t++) {

			String[] split = in.readLine().split(" ");
			N = Integer.parseInt(split[0]); // 마을에 사는 사람 수
			M = Integer.parseInt(split[1]); // 서로 알고 있는 사람 관계수

			graph = new ArrayList[N + 1];
			for (int i = 0; i <= N; i++) {
				graph[i] = new ArrayList<>();
			}

			for (int i = 0; i < M; i++) {
				split = in.readLine().split(" ");
				int idx = Integer.parseInt(split[0]);
				int neighbor = Integer.parseInt(split[1]);
				graph[idx].add(neighbor);
				graph[neighbor].add(idx);
			}

//			System.out.println(Arrays.toString(graph));
			visited = new boolean[N + 1];

			int ans = 0;
			for (int i = 1; i <= N; i++) {
				if (!visited[i]) {
					connect(i);
					ans++;
				}
			}

			System.out.printf("#%d %d\n", t, ans);

		}

	}

	private static void connect(int curr) {

		visited[curr] = true;
		for (int next : graph[curr]) {
			if (!visited[next]) {
				visited[next] = true;
				connect(next);
			}
		}
	}

}