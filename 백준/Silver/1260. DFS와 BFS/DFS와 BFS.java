import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Queue;

public class Main {

	private static List<Integer>[] graph;

	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] split = in.readLine().split(" ");

		int n = Integer.parseInt(split[0]);
		int m = Integer.parseInt(split[1]);
		int v = Integer.parseInt(split[2]); // 탐색 시작할 번호

		graph = new ArrayList[n + 1];

		for (int i = 0; i <= n; i++) {
			graph[i] = new ArrayList<Integer>();
		}

		for (int i = 0; i < m; i++) {
			split = in.readLine().split(" ");
			int from = Integer.parseInt(split[0]);
			int to = Integer.parseInt(split[1]);

			graph[from].add(to);
			graph[to].add(from);
		}
		for (List<Integer> g : graph) {
			Collections.sort(g);
		}

		boolean[] visited = new boolean[n + 1];
		dfs(visited, v, n);
		System.out.println();
		bfs(v, n);
	}

	private static void dfs(boolean[] visited, int start, int n) {

		visited[start] = true;
		System.out.print(start + " ");

		for (int next : graph[start]) {
			if (!visited[next]) {
				dfs(visited, next, n);
			}
		}

	}

	private static void bfs(int start, int n) {

		Queue<Integer> queue = new ArrayDeque<>();
		boolean[] visited = new boolean[n + 1];

		queue.offer(start);
		visited[start] = true;

		int curr = 0;
		while (!queue.isEmpty()) {
			curr = queue.poll();
			System.out.print(curr + " ");

			for (int v : graph[curr]) {
				if (!visited[v]) {
					queue.offer(v);
					visited[v] = true;
				}
			}
		}

	}
}